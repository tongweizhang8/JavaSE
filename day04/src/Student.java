public class Student extends Person{
//    String name;
//    int age;
    String major;

    public Student(String name, int age,String major) {
        this.name = name;
        this.age = age;
        setAge(age);
        this.major =major;
    }
    public Student(){

    }
//    public void eat(){
//        System.out.println("吃饭");
//    }
//    public void sleep(){
//        System.out.println("睡觉");
//    }
    public void study(){
        System.out.println("学习");
    }
}
