package study_Super;

import study_Rewrite.Order;

public class SubOrder extends Order {
    public void method(){
        orderProtected = 1;
        orderPublic = 2;

        methodProtected();
        methhodDefault();

        //在不同包的子类中，不能调用Order类中声明的Private和缺省权限的属性和方法
//        orderDefault = 3;
//        orderPrivate = 4;
//
//        methhodDefault();
//        methodPrivate();
    }
}
