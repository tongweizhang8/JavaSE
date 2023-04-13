package service;

import domain.*;

import static service.Data.*;

/**
 * @Description 負責將data中的數據封裝到employee【】數組中，同時提供相關操作的employee【】的方法
 * @author
 * @version
 * @date
 */
public class NameListService {
    private Employee[] employees;

    /**
     * 給employee數組及數組元素初始化
     */
    public NameListService() {
        //根據項目提供的Data類構建相應大小的employee【】數組
        //再根據Data類中的數據構建不同的對象，包括employee,designer,programmer,和,architecture
        //將對象存於數組中
        employees = new Employee[EMPLOYEES.length];
        for (int i = 0; i < employees.length; i++){
            int type = Integer.parseInt(EMPLOYEES[i][0]);
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            String name = EMPLOYEES[i][2];
            int id = Integer.parseInt(EMPLOYEES[i][1]);
            Double salary = Double.parseDouble(EMPLOYEES[i][4]);
            Equipment equipment;
            switch (type){
                case EMPLOYEE:
                    employees[i] = new Employee(id,name,age,salary);
                    break;
                case PROGRAMMER:
                    equipment = createnewEquipment(i);
                    employees[i] = new Programmer(id,name,age,salary,equipment);
                    break;
                case DESIGNER:
                    equipment = createnewEquipment(i);
                    Double bones = Double.parseDouble(EMPLOYEES[i][5]);
                    employees[i] = new Designer(id,name,age,salary,equipment,bones);
                    break;
                case ARCHITECT:
                    equipment = createnewEquipment(i);
                    bones = Double.parseDouble(EMPLOYEES[i][5]);
                    int stock = Integer.parseInt(EMPLOYEES[i][6]);
                    employees[i] = new Architect(id,name,age,salary,equipment,bones,stock);
                    break;
            }
        }
    }

    /**
     * 獲取指定員工上的equipment設備
      * @return
     */
    private Equipment createnewEquipment(int index) {
        int key = Integer.parseInt(EQUIPMENTS[index][0]);
        switch(key){
            case PC:
                String model = EQUIPMENTS[index][1];
                String display = EQUIPMENTS[index][2];
                return new PC(model,display);
            case NOTEBOOK:
                model = EQUIPMENTS[index][1];
                double price = Double.parseDouble(EQUIPMENTS[index][2]);
                return new NoteBook(model,price);
            case PRINTER:
                String name = EQUIPMENTS[index][1];
                String type = EQUIPMENTS[index][2];
                return new printer(name,type);
        }
        return null;
    }

    /**
     * 獲取當前所有員工
     * @return
     */
    public Employee[] getAllEmployees() {
        return employees;
    }

    /**
     * 獲取指定id的員工對象
     *
     * @return
     */
    public Employee getEmployee(int i) throws TeamException {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id) {
                return employees[i];
            }
        }
        throw new TeamException("找不到指定員工");

    }
}
