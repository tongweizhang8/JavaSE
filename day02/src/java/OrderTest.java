package java;

public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();
        order.orderDefault = 1;
        order.orderPublic = 2;
        //出了Order类之后，私有的结构就不可以调用了
        //order.orderPrivate = 3;//orderPrivate' has private access in 'Order'

        order.methodDefault();
        order.methodPublic();
        //出了Order类之后，私有的结构就不可以调用了
        //order.methodPrivate();//'methodPrivate()' has private access in 'Order'
    }
}
