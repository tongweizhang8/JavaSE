package service;

import domain.Architect;
import domain.Designer;
import domain.Employee;
import domain.Programmer;

import static sun.awt.image.PixelConverter.Argb.instance;

public class TeamService {
    private static int counter = 1;//給memberid賦值使用
    private final int MAX_MEMBER = 5;//限制開發團隊的人數
    private Programmer[] team = new Programmer[MAX_MEMBER];//保存開發團隊成員
    private int total;//記錄開發中團隊實際人數

    /**
     * 獲取開發團隊中的所有成員
     * @return
     */
    public Programmer[] getTeam() {
        Programmer[] team = new Programmer[total];
        for (int i = 0; i < team.length; i++) {
            team[i] = this.team[i];
        }
        return team;
    }
    public void addMember(Employee e) throws TeamException {
        //成員已滿，無法添加
        if (total >= MAX_MEMBER){
            throw new TeamException("成員已滿，無法添加");
        }
        //該員工不是開發人員，無法添加
        if (!(e instanceof Programmer)){
            throw new TeamException("該員工不是開發成員，無法添加");
        }
        //該員工已在本開發團隊中
        if (isExit(e)) {
            throw new TeamException("該員工已在本開發團部隊中");
        }
        //該員工已是某團隊成員
        //該員工正在休假，無法添加
        Programmer p = (Programmer)e;//一定不会出现ClassCastException
        if("BUSY".equals(p.getStatus().getNAME())){//if(p.getStatus().getNAME().equals("BUSY")){
            throw new TeamException("该员工已是某团队成员");
        }else if("VOCATION".equals(p.getStatus().getNAME())){
            throw new TeamException("该员正在休假，无法添加");
        }

        //團隊中至多只能有一名架構師
        //團隊中至多智能有兩名設計師
        //團隊中至多只能有三名程序員
        //獲取team中已有的架構師，設計師，程序員人數
        int numArc = 0,numDes = 0,numPro = 0;
        for(int i = 0; i < total;i++) {
            if (team[i] instanceof Architect) {
                numArc++;
            }else if (team[i] instanceof Designer){
                numDes++;
            }else if (team[i] instanceof Programmer){
                numPro++;
            }
        }
        if (p instanceof Architect){
            if (numArc >= 1){
                throw new TeamException("團隊中至多只能有一名架構師");
            }
        }else if (p instanceof Designer){
            if (numDes >= 2){
                throw new TeamException("團隊中至多只能有兩名設計師");
            }
        }else if (p instanceof Programmer){
            if (numPro >= 3){
                throw new TeamException("團隊中至多只能有三名程序員");
            }
        }
        //將p或e添加到現有的team中
        team[total] = p;
        total++;
        //p的屬性值
        p.setStatus(Status.BUSY);
        p.setMemberId(counter++);
    }

    /**
     * 判斷指定的員工是否存在於現有的開發團隊中
     * @param e
     * @return
     */
    private boolean isExit(Employee e) {
        for (int i = 0; i < total;i++){
            if(team[i].getId() == e.getId()){
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param memberId
     */
    public void removeMember(int memberId) throws TeamException {
        int i = 0;
        for (;i < total;i++){
            if (team[i].getMemberId() == memberId){
                team[i].setStatus(Status.FREE);
                break;
            }
        }

        //未找到指定memberId情況
        if (i == total){
            throw new TeamException("找不到指定id員工，刪除失敗");
        }

        //後一個元素覆蓋前一個元素，實現刪除操作
//        for (int j = i;j < total - 1;j++){
//            team[j] = team[j + 1];
//        }
        for (int j = i - 1;j < total;j++){
            team[j - 1] = team[j];
        }
//        team[total - 1] = null;
//        total--;
        team[--total] = null;
    }
}
