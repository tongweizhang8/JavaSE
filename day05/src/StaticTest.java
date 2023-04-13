import java.util.concurrent.Callable;

/*
static关键字使用
1.static静态的
2.static可以用来修饰；属性，方法，代码块，内部类
3.使用static修饰属性;静态变量
    3.1属性，按是否使用static修饰，又分为；静态属性，非静态属性（实例变量）
        实例变量；我们创建了类的多个个对象，每个对象都独立拥有一套类中非静态属性，
                当修改其中一个非静态属性时，不会导致其他对象中同样属性值修改
        静态变量；我们创建了类的多个对象，多个对象共享同一个静态变量，
                当通过某一个对象修改静态变量时，会导致其他变量调用此变量时，是修改过的
    3.2static修饰属性的其他说明；
        1）静态变量随着类的加载而加载，可以通过“类。静态变量”的方式进行调用
        2）静态变量的加载要早于对象的创建
        3）由于类只会加载一次，则静态变量在内存中也只会存在一份，存在方法区的静态域中
        4）
                类变量             实例变量
          类     yes                 no
          对象   yes                 no
        5）静态属性举例；System.out;Math.PI;
4.使用static修饰方法
    1)随着类的加载而加载,可以通过“类.静态方法”的方式调用
    2）
                静态方法            非静态方法
          类     yes                 no
          对象   yes                 no
    3）静态方法中，只能调用静态方法或属性，
      非静态方法中，既可以调用静态方法或属性，也可以调用非静态方法或属性
5.static注意点；
    5.1在静态方法内，不能使用this关键字，super关键字
    5.2关于静态属性和静态方法使用，从生命周期角度理解
6.开发中，如何确定一个属性是否要声明为static
    属性是可以被多个对象所共享的，不会随着对象的不同而不同
  开发中，如何确定一个方法是否要声明static
    操作静态属性的方法，通常设置为static，
    工具类中的方法，习惯声明static，比如；Math，Arrays，Collections
 */
public class StaticTest {
    public static void main(String[] args) {

        Chinese.nation = "China";

        Chinese c1 = new Chinese();
        c1.name = "姚明";
        c1.age = 40;
        c1.nation = "CHN";

        Chinese c2 = new Chinese();
        c2.name = "马龙";
        c2.age = 30;
        c2.nation = "CHINA";

        System.out.println(c1.nation);

        //编译不通过
        //Chinese.name = "张继科";

        c1.eat();

        Chinese.show();
        //编译不通过
        //Chinese.eat();

    }
}
class Chinese{
    String name;
    int age;
    static String nation;

    public void eat(){
        //调用非静态结构
        System.out.println("中餐");
        this.info();
        //调用静态结构
        walk();
        System.out.println(Chinese.nation);
    }

    private void info() {
    }

    public static void show(){
        System.out.println("我是中国人");

        //不能调用非静态结构
        //eat();
        //name = "Tom";
        //可以调用静态结构
        walk();
        System.out.println(Chinese.nation);
    }
    public static void walk(){

    }

}

