package java1;

import java.Order;

public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();
        //出了Order类之后，私有的结构就不可以调用了
        //order.orderDefault = 1;//'orderDefault' is not public in 'java.Order'. Cannot be accessed from outside package
        order.orderPublic = 2;
        //出了Order类之后，私有的结构就不可以调用了
        //order.orderPrivate = 3;//orderPrivate' has private access in 'Order'

        //出了Order类之后，私有的结构就不可以调用了
        //order.methodDefault();//methodDefault()' is not public in 'java.Order'. Cannot be accessed from outside package
        order.methodPublic();
        //出了Order类之后，私有的结构就不可以调用了
        //order.methodPrivate();//'methodPrivate()' has private access in 'Order'
    }
}
