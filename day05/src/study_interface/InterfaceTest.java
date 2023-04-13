package study_interface;
/*
接口的使用；
1.接口使用interface来定义
2.java中，接口和类是并列的两个结构
3.如何定义接口，定义接口的成员
    3.1 jdk7以前；只能定义全局常量和抽象方法
        全局常量；public static final的,可以省略不写
        抽象方法；public abstract的
    3.2 jdk8；除了定义全局常量和抽象方法，还可以定义静态方法和默认方法（略）
4.接口中不能定义构造器,意味接口不可以实例化
5.java开发中，接口通过让类来实现（implements）的方式使用
  如果实现类覆盖了接口中所有的方法则此实现类可以实例化，如果实现类没有覆盖接口中所有的抽象方法则此实现类仍然是一个抽象类
6.java类可以实现多个接口；弥补了java单继承性的局限性
    格式；class AA extends BB implements CC,DD,EE;
7.接口与接口之间可以继承，而且可以多继承

8.接口的具体使用，体现多态性
9.接口，实际上可以看作是一种规范
*/
public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MAX_SPEED);
        System.out.println(Flyable.MIN_SPEED);
        //Flyable.MIN_SPEED = 2;
    }
}
interface Flyable {
    //全局常量
    public static final int MAX_SPEED = 7900;//第一宇宙速度
    int MIN_SPEED = 1;//省略了public static final

    //抽象方法
    public abstract void fly();

    //省略了public abstract
    void stop();

    //    public flyable(){
//
//    }
}

interface Attackable{
    void attack();
}

class Plane implements Flyable {

    @Override
    public void fly() {
        System.out.println("通过引擎起飞");
    }

    @Override
    public void stop() {
        System.out.println("驾驶员减速停止");
    }
}
abstract class Kite implements Flyable {
    @Override
    public void fly() {

    }
}

class Bullet extends Object implements Flyable,Attackable{

    @Override
    public void fly() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void attack() {

    }
}


interface AA{
    void method1();
}
interface BB{
    void method2();
}
interface CC extends AA,BB{

}