/*
定义一个Employee类，
该类包含：private成员变量name，age，birthday，其中birthday为MyDate类的对象；
并为每一个属性定义getter，setter方法；
并重写toString方法输出name，age，birthday
 */
public class Employee implements Comparable{
    private String name;
    private int age;
    private MyDate birthDay;

    public Employee(String name, int age, MyDate birthDay) {
        this.name = name;
        this.age = age;
        this.birthDay = birthDay;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MyDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(MyDate birthDay) {
        this.birthDay = birthDay;
    }

    //按照name排序
    @Override
    public int compareTo(Object o) {
        if (o instanceof Employee){
            Employee employee = (Employee)o;
            return this.name.compareTo(employee.name);
        }
        throw new RuntimeException("传入的数据类型不一致");
    }
}