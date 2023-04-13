package study_Polyorphism;

import java.sql.Connection;

//多态性的使用举例1
public class AnimalTest {
    public void main(String[] args) {
        AnimalTest test = new AnimalTest();
        test.func(new Dog());
    }
    public void func(Animal animal) {
        animal.eat();
        animal.shout();
    }
    class Animal{
        public void eat(){
            System.out.println("动物进食");
        }
        public void shout(){
            System.out.println("动物叫");
        }
    }
    class Dog extends Animal {
        public void eat(){
            System.out.println("狗吃骨头");
        }
        public void shout(){
            System.out.println("汪汪汪");
        }
    }
    class Cat extends Animal {
        public void eat(){
            System.out.println("猫吃鱼");
        }
        public void shout(){
            System.out.println("喵喵喵");
        }
    }
    //方式二
    class Order{
        public void method(Object obj){

        }
    }
    //方式三
    class Driver{
        public void doDate(Connection conn){//conn = new MySQLConnection();//conn = new OracleConnection();
            //规范的步骤去操作数据
//            conn.method1();
//            conn.method2();
//            conn.method3();
        }
    }
}
