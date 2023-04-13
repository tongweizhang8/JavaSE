package study_Polyorphism;

import static sun.awt.image.PixelConverter.Argb.instance;

/*
面向对象特征三；多态性

1.理解多态性，可以理解为一个事物的多种形态
2.何为多态性；父类的引用指向子类的对象（或子类的对象赋给父类的引用）
3.多态性的使用；虚拟方法调用
    有了对象的多态性以后，我们在编译期，只能调用父类的方法，但在运行期，我们实际值行的是子类重写父类的方法
    总结；编译；看左边：运行；看右边
4.多态性的使用前提；1）类的集成性 2)方法的重写
5.对象的多态性只适用于方法，不适用于属性
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.eat();

        Man man = new Man();
        man.walk();
        man.age = 25;
        man.earnMoney();

        //对象多态性，父类的引用指向子类的对象
        Person p2 = new Man();

        //Person p3 = new Woman();
        //多态的使用; 当调用子父类同名的参数方法时，实际值行的是子类重写父类的方法---虚拟方法调用
        p2.eat();
        p2.walk();

        //p2.earnMoney();
        System.out.println(p2.id);//1001 父类

        System.out.println("********************************");
        //不能调用子类所特有的方法,属性，编译时p2是person类型
//        p2.earnMoney();
//        p2.isSmoking() = true;
        //有了对象的多态性以后，内存中实际上是加在了子类特有的属性和方法，但是由于变量声明为父类类型，
        // 导致编译时，只能调用父类的属性和方法，子类特有的
        //属性和方法不能调用
        Man m1 = (Man)p2;
        m1.earnMoney();
        m1.isSmoking = true;
        //使用强转时，可能会出现Exception in thread "main" java.lang.ClassCastException:
        // study_Polyorphism.Man cannot be cast to study_Polyorphism.Woman
        //at study_Polyorphism.PersonTest.main(PersonTest.java:44)
//        Woman w1 = (Woman)p2;
//        w1.shopping();

        //instanceof
        /*
        a instanceof A;判断对象a是否为类A的实例，如果是，返回true，如果不是，返回false

        使用情境；为了避免你你再向下转型时出现ClassCaseException异常，再向下转型之前，先进性instanceof判断
        ，一旦返回true，就进行向下转型，返回false，则不进行向下转型

        如果a instanceof A返回true，则a instanceof B也返回true，
        其中，类B是类A的父类
         */
        if(p2 instanceof Woman) {
            Woman w1 = (Woman) p2;
            w1.shopping();
            System.out.println("*****Woman****");
        }
        if(p2 instanceof Man) {
            Man w1 = (Man) p2;
            w1.earnMoney();
            System.out.println("*****Man****");
        }

        //练习
        //问题1；编译通过，运行不通过

//        Person p3 = new Woman();
//        Man m3 = (Man) p3;

 //       Person p3 = new Person();
//        Man m3 = (Man) p3;

        //问题2，编译通过，运行也通过
        Object obj = new Woman();
        Person p = (Person) obj;

        //问题3
//        Man p5 = new Woman();
    }
}
