package view;

import domain.Employee;
import domain.Programmer;
import service.NameListService;
import service.TeamException;
import service.TeamService;

public class TeamView {
    private NameListService listSvc = new NameListService();
    private TeamService teamSvc = new TeamService();
    public void enterMainMenu() throws TeamException {
        boolean loopFlag = true;
        while (loopFlag) {
            listAllEmployees();
            System.out.println("1-團隊列表 2-添加團隊成員 3-刪除團隊成員 4-退出 請選擇（1-4）");
            char menu = TSUtility.readMenuSelection();
            switch (menu) {
                case '1':
                    getTeam();
                    break;
                case '2':
                    addMember();
                    break;
                case '3':
                    deleteMember();
                    break;
                case '4':
                    System.out.println("退出");
                    System.out.println("確認是否退出（Y/N");
                    char isExit = TSUtility.readConfirmSelection();
                    if (isExit == 'Y'){
                        loopFlag = false;
                    }
                    break;
            }
        }

    }

    /**
     * 顯示所有的員工信息
     */
    private void listAllEmployees(){
        System.out.println("顯示公司所有員工信息");
        System.out.println("--------------------------開發團隊調度軟件--------------------------");
        Employee[] employees = listSvc.getAllEmployees();
        if (employees == null || employees.length == 0) {
            System.out.println("公司中沒有任何元素信息");
        }else {
            System.out.println("ID\t姓名\t年齡\t工資\t職位\t狀態\t獎金\t股票\t領用設備");
            for (int i = 0; i < employees.length; i++) {
                System.out.println(employees[i]);
            }
        }
        System.out.println("----------------------------------------------------------------");
    }
    private void getTeam(){
        System.out.println("查看開發團隊情況");
        System.out.println("--------------------------團隊成員列表-----------------------------");
        Programmer[] team = teamSvc.getTeam();
        if (team == null || team.length == 0){
            System.out.println("開發團對沒有任何成員");
        }else{
            System.out.println("TID/ID\t姓名\t年齡\t工資\t職位\t獎金\t股票\n");
            for (int i = 0; i < team.length; i++){
                System.out.println(team[i]);
            }
        }
        System.out.println("----------------------------------------------------------------");
    }
    private void addMember() throws TeamException {
        System.out.println("添加團隊成員");
        System.out.println("--------------------------添加團隊成員------------------------------");
        System.out.println("請輸入需要添加員工的id");
        int id = TSUtility.readInt();
        Employee emp = listSvc.getEmployee(id);
        try {
            teamSvc.addMember(emp);
            System.out.println("添加成功");
        } catch (TeamException e) {
            System.out.println("添加失敗" + e.getMessage());
        }
        TSUtility.readReturn();
    }
    private void deleteMember(){
        System.out.println("刪除團隊成員");
        System.out.println("----------------------------刪除成員--------------------------------");
        System.out.println("請輸入要刪除員工的id");
        int id = TSUtility.readInt();
        System.out.println("請確認是否刪除(Y/N)");
        char isDelete = TSUtility.readConfirmSelection();
        if (isDelete == 'N'){
            return;
        }
        try {
            teamSvc.removeMember(id);
        } catch (TeamException e) {
            System.out.println("刪除失敗" + e.getMessage());
        }
        TSUtility.readReturn();
    }
    public static void main(String[] args) throws TeamException {
        TeamView view = new TeamView();
        view.enterMainMenu();
    }
}
