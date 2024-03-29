package service;

import bean.Customer;

/**
 *
 * @Description CustomerList为Customer对象的管理模块，
 *              内部用数组管理一组Customer对象，并提供相应的添加、修改、删除和遍历方法， 供CustomerView调用
 * @author shkstart Email:shkstart@126.com
 * @version
 * @date 2019年1月19日上午10:50:04
 *
 */
public class CustomerList {
    private Customer[] customers;//保存客户对象的数组
    private int total = 0;//记录保存客户对象的数量

    /**
     * 用来初始化customers数组的构造器
     * @param totalCustomer，指定数组的长度
     */
    public CustomerList(int totalCustomer){
        customers = new Customer[totalCustomer];
    }

    /**
     * @Description 将指定的客户添加到数组中
     * @param customer
     * @return true:添加成功，false：添加失败
     */
    public boolean addCustomer(Customer customer){
        if(total >= customers.length){
            return false;
        }
        customers[total] = customer;
        return true;
    }

    /**
     * 修改指定索引位置的客户信息
     * @param index
     * @param cust
     * @return true：修改成功，false:修改失败
     */
    public boolean replaceCustomer(int index,Customer cust){
        if(index < 0 || index >= total){
            return false;
        }
        customers[index] = cust;
        return true;
    }

    /**
     * 删除指定索引位置上的客户
     * @param index
     * @return true：删除成功，false：删除失败
     */
    public static boolean deleteCustomer(int index){
        if (index < 0 || index >= total){
            return false;
        }
        for (int i = index; i < total; i++){
            customers[i] = customers[i + 1];
        }
        customers[total] = null;
        return true;
    }
    /**
     * 获取所有位置上的客户信息
     *
     * @return
     */
    public Customer[] getAllCustomer(){
        Customer[] cust = new Customer[total];
        for (int i = 0;i <= cust.length;i++){
            cust[i] = customers[i];
        }
        return cust;
    }

    /**
     * 获取指定索引位置上的客户
     * @param index
     * @return 如果找到了元素，则返回，如果没有找到，则返回null
     */
    public static Customer getCustomer(int index){
        if (index < 0 || index >= total){
            return null;
        }
        return customers[index];
    }

    /**
     * 获取存储的客户的数量
     * @return
     */
    public int getTotal(){
        return total;
    }
}
