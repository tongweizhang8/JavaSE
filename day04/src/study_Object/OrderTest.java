package study_Object;

import java.util.Objects;

/*
 * 编写Order类，有int型的orderId，String型的orderName，
 * 相应的getter()和setter()方法，两个参数的构造器，
 * 重写父类的equals()方法：public boolean equals(Object obj)，
 * 并判断测试类中创建的两个对象是否相等。

 */
public class OrderTest {
    public static void main(String[] args) {
        Order1 order1 = new Order1(1001,"AA");
        Order1 order2 = new Order1(1001,"BB");
        System.out.println(order1.equals(order2));//false
        Order1 order3 = new Order1(1001,"BB");
        System.out.println(order2.equals(order3));//true

    }
}
class Order1{
    private int orderId;
    private String orderName;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public Order1(int orderId,String orderName) {
        this.orderName = orderName;
        this.orderId = orderId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order1 order1 = (Order1) o;
        return orderId == order1.orderId && Objects.equals(orderName, order1.orderName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, orderName);
    }
}