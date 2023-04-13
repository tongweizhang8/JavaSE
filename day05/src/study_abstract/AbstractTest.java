package study_abstract;
/*
abstract关键字的使用
    1.abstract抽象的
    2.abstract可以用来修饰的结构；类，方法
    3.abstract修饰类；抽象类
        此类不能实例化
        抽象类中一定有构造器，便于子类实例化时候调用（涉及子类对象实例化全过程）
        开发中都会提供抽象类的子类，让子类完成实例化，完成相关操作
    4.abstract修饰方法；抽象方法
        抽象方法只有方法声明，没有方法体
        包含抽象方法的类一定是一个抽象类，反之，抽象类中可以没有抽象方法
        若子类重写了父类中的抽象方法后，此子类方可实例化，
        若子类没有重写父类中的抽象方法，此子类也是一个抽象类，需要使用abstract修饰
 */
public class AbstractTest {
    public static void main(String[] args) {
        //一旦person类抽象，就不可实例化
//        Person1 p1 = new Person1();
//        p1.eat();
    }
}
abstract class Creature{
    public abstract void breath();
}

abstract class Person1 extends Creature {
    String name;
    int age;

    public Person1(){

    }
    public Person1(String name, int age){
        this.name = name;
        this.age = age;
    }
    //不是抽象方法
//    public void eat(){
//
//    }
    //抽象方法
    public abstract void eat();
    public void walk(){
        System.out.println(" walk");
    }
}

class Student extends Person1 {
    public Student(int age,String name){
        super(name,age);
    }

    public Student() {

    }

    public void eat(){
        System.out.println("学生应该多吃有营养的食物");
    }

    @Override
    public void breath() {
        System.out.println("学生应该呼吸新鲜的空气");
    }
}