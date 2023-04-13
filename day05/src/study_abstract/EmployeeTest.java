package study_abstract;

/*
请使用继承的思想，设计CommonEmployee和Manager类，要求类中提供必要的方法进行属性访问
 */
public class EmployeeTest {
    public static void main(String[] args) {
        //多态
        Manager manager = new Manager("库克",1001,5000,50000);
        manager.work();

        CommonEmployee commonEmployee = new CommonEmployee();
        commonEmployee.work();
    }
}
