/*
一。理解“万事万物皆对象”
1.在Java语言中，我们都将功能，结构封装到类中，通过类的实例化，来调用具体功能结构
    >Scanner,String等
    >文件；file
    >网络资源；URL
2.涉及到Java语言与前端Html，后端的数据库交互时，前后端的结构在Java层面交互时，都体现为类，对象
二。内存解析的说明
1.引用类型的变量，只可能存储2类值，null或地址值（含变量的类型）
三。匿名对象的使用
1.理解；我们创建的对象，没有显示赋值的变量名，即匿名对象
2.特征；匿名对象只能调用一次
 */
public class InstanceTest {
    public static void main(String[] args) {
        Phone p = new Phone();
        //p = null;
        System.out.println(p);

        p.playGame();
        p.sendEmail();

        //匿名对象
//        new Phone().sendEmail();
//        new Phone().playGame();
        new Phone().price = 1999;
        new Phone().showprice();//0.0

        //*********************************
        PhoneMall mall = new PhoneMall();
        //mall.show(p);
        //匿名对象的使用
        mall.show(new Phone());

    }
}
class PhoneMall{
    public void show(Phone phone){
        phone.sendEmail();
        phone.playGame();
    }
}
class Phone{
    double price;//价格

    public void sendEmail(){
        System.out.println("发送邮件");
    }
    public void playGame(){
        System.out.println("玩游戏");
    }
    public void showprice(){
        System.out.println("手机价格为" + price);
    }
}
