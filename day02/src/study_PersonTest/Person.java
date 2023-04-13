package study_PersonTest;

public class Person {
    String name;
    /**
     * sex:1表明男性
     * sex:0表明女性
     */
    int age;
    int sex;
    public void study(){
        System.out.println("studying");
    }
    public void showAge(){
        System.out.println("age:" + age);
    }
    public int addAge(int i){
        age += i;
        return age;
    }
}
