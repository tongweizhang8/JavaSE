/*
 * 定义类KidsTest，在类的main方法中实例化Kids的对象someKid，用该对象访问其父类的成员变量及方法。

 */
public class KidsTest {
    public static void main(String[] args) {
        Kids someKids = new Kids(12);
        someKids.printAge();
        someKids.setSalary(0);
        someKids.setSex(1);

        someKids.employeed();
        someKids.manOrWoman();

    }
}
