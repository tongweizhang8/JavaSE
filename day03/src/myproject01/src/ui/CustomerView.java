package ui;

import bean.Customer;
import service.CustomerList;
import util.CMUtility;

/**
 *
 * @Description CustomerView为主模块，负责菜单的显示和处理用户操作
 * @author shkstart Email:shkstart@126.com
 * @version
 * @date 2019年1月19日上午10:51:11
 *
 */
public class CustomerView {
    private CustomerList customerList = new CustomerList(10);

    /**
     * 显示《客户信息管理软件》界面的方法
     */
    public void enterMainMenu(){
        boolean isFlag = true;
        while(isFlag){
            System.out.println("\n**********************客户信息管理软件**************************");
            System.out.println("                         1.添加客户");
            System.out.println("                         2.修改客户");
            System.out.println("                         3.删除客户");
            System.out.println("                         4.客户列表");
            System.out.println("                         5.退   出");
            System.out.println("                      请选择（1-5）");
        }
        char menu = CMUtility.readConfirmSelection();
        switch (menu) {
            case '1':
                addNewCustomer();
                break;
            case '2':
                modifyCustomer();
                break;
            case '3':
                deleteCustomer();
                break;
            case '4':
                listAllCustomer();
                break;
            case '5':
                System.out.println("退出");
                System.out.println("确认是否退出（Y/N)");
                char isExit = CMUtility.readConfirmSelection();
                if (isExit == 'Y') {
                    isFlag = false;
                }
                break;
        }
    }

    /**
     * 添加客户的操作
     */
    public void addNewCustomer() {
        System.out.println("添加客户");
        System.out.println("---------------------------添加客户-----------------------------");
        System.out.print("姓名");
        String name = CMUtility.readString(10);
        System.out.println("性别");
        char gender = CMUtility.readChar();
        System.out.println("年龄");
        int age = CMUtility.readInt();
        System.out.println("电话");
        String phone = CMUtility.readString(13);
        System.out.println("电子邮件");
        String email = CMUtility.readString(30);
        Customer customer = new Customer(name,gender,age,phone,email);
        boolean isSuccess = customerList.addCustomer(customer);
        if (isSuccess){
            System.out.println("-------------------添加成功----------------------------");
        }else {
            System.out.println("-------------------添加失败----------------------------");
        }
    }

    /**
     * 修改客户的操作
     */
    private void modifyCustomer(){
        System.out.println("修改客户");
        Customer cust;
        int number;
        for (;;){
            System.out.println("请选择修改的客户编号（-1退出）");
            number = CMUtility.readInt();
            if(number == -1){
                return;
            }
            cust = customerList.getCustomer(number - 1);
            if(cust == null){
                System.out.println("无法找到客户");
            }else{
                break;
            }
            System.out.println("姓名（" + cust.getName() + "）：");
            String name = CMUtility.readString(10,cust.getName());
            System.out.println("年龄（" + cust.getAge() + ") :");
            int age = CMUtility.readInt(cust.getAge());
            System.out.println("性别（" + cust.getGender() + "）：");
            int gender = CMUtility.readInt(cust.getGender());
            System.out.println("电话（" + cust.getPhone() + "）：");
            String phone = CMUtility.readString(13,cust.getPhone());
            System.out.println("邮件（" + cust.getEmail() + "）：");
            String email = CMUtility.readString(30,cust.getEmail());
            Customer newCustomer = new Customer(name,age,gender,phone,email);
            boolean isReplaced = customerList.replaceCustomer(number - 1, newCustomer);
            if (isReplaced){
                System.out.println();
            }else{
                System.out.println();
            }
        }
    }

    /**
     * 删除客户的操作
     */
    public void deleteCustomer(){
        System.out.println("删除客户");
        System.out.println("------------------------删除客户------------------------");
        int number;
        for(;;){
            System.out.println("请选择待删除的客户");
            number = CMUtility.readInt();
            if (number == -1){
                return;
            }
            Customer customer = CustomerList.getCustomer(number - 1);
            if (customer == null){
                System.out.println("无法找到指定客户");
            }else{
                break;
            }
        }
        System.out.println("确认是否删除（Y/N");
        char isDelete = CMUtility.readConfirmSelection();
        if (isDelete == 'Y'){
            boolean deleteCustomer = CustomerList.deleteCustomer(number - 1);
        }else {
            return;
        }
    }

    /**
     * 显示客户列表的操作
     */
    public void listAllCustomer(){
        System.out.println("显示客户");
        System.out.println("*************************客户列表***************************");
        int total = customerList.getTotal();
        if (total == 0){
            System.out.println("没有客户记录");
        }else{
            System.out.println("编号\t姓名\t性别\t年龄\t电话\t邮箱");
            Customer[] custs = customerList.getAllCustomer();
            for(int i = 0;i < custs.length;i++){
                Customer cust = custs[i];
                System.out.println((i + 1) + "\t" + cust.getName() +
                        "\t" + cust.getGender() + "\t" + cust.getAge() +
                        "\t" + cust.getPhone() + "\t" + cust.getEmail());
            }
        }
        System.out.println("-------------------------客户列表完成-------------------------");
    }
    public static void main(String[] args) {

    }
}
