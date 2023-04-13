package study_abstract;
/*
抽象类的匿名子类
 */
public class PersonTest {
    public static void main(String[] args) {
        method(new Student());//匿名对象

        Worker worker = new Worker();
        method1(worker);//非匿名的类非匿名的对象

        method1(new Worker());//非匿名的类匿名的对象

        //创建了一匿名子类的对象，p
        Person1 p  = new Person1(){

            @Override
            public void eat() {
                System.out.println("吃");
            }

            @Override
            public void breath() {
                System.out.println("呼吸");
            }
        };
        method1(p);
    }

    public static void method1(Person1 p){
        p.eat();
        p.walk();
    }
    public static void method(Student s){

    }
}
class Worker extends Person1{

    @Override
    public void breath() {

    }

    @Override
    public void eat() {

    }
}
