package study_Super;
/*
子类对象实例化全过程
1.从结果上看（继承性）
    子类继承父类以后，就获取了声明中的属性或方法
2.从过程上来看
      当我们通过子类的构造器创建子类对象时，我们一定会直接或间接的调用其父类的构造器，进而调用父类的父类构造器
    直到调用了java.lang.Object类中空参为止，正因为加载过所有的父类结构，所以才可以看到内存中有父类的结构，
    子类的对象才可以考虑进行调用

明确；虽然创建子类对象时，调用了父类的构造器，但是至始至终就创建了一个构造器，即为new的子类对象

 */
public class InstanceTest {
}
