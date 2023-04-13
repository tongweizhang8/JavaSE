import java.util.concurrent.Callable;

/*
类中方法声明和使用

方法；描述类应具有的功能
比如；Math类sqrt()\random()\...
     scanner类；nextXxx()...
     Arrays类：sort()\binarySearch()\toString()\equals()\...
1.举例
public void eat(){}//void无返回值
public void sleep(int hour){}//(**)形参
public String getName(){}//String有返回值
public String getNation(String Nation){}
2.方法的声明 权限修饰符 返回值类型 方法名（形参列表）{
            方法体
  }
  static final abstract 来修饰的方法，后面在讲
3.说明
    3.1关于权限修饰符；默认方法的权限修饰符先都使用public
        Java规定的四种权限修饰符；private，public，缺省，protected-->封装性再细说
    3.2返回值类型 有返回值 vs 无返回值
        3.2.1如果方法有返回值，则必须在方法声明时指定返回值的类型，同时，方法中，需要使用
             return关键字来返回指定类型的常量或变量 “return 数据”
             如果方法没有返回值，则方法声明时，使用void来表示。通常，没有返回值的方法中，就不需要
             使用return，但是，如果使用的话，只能“return；“表示结束此方法的意思

        3.2.2我们定义方法该不该有返回值
            1)题目要求
            2）凭经验，具体要求具体分析
    3.3方法名：属于标识符，遵循标识符的规则和规范，”见名知意“
    3.4形参列表：方法可以声明0个，1个或多个形参
        3.4.1格式；数据类型1 形参1，数据类型2 形参2......
        3.4.2我们定义方法时，该不该定义形参？
            1）题目要求
            2）凭经验，具体要求具体分析
    3.5方法体；方法功能的体现。

4.return关键字的使用；
    1.使用范围；使用在方法体中
    2.作用；1）结束方法
           2）针对于有返回值的类型的方法，使用”return 数据“方法返回所要的数据。
    3.注意点；return关键字后面不可以声明执行语句
5.方法的使用中，可以调用当前类的属性或方法
    特殊的，方法A中又调用了方法A；递归方法。
 */
public class CustomerTest {
    public static void main(String[] args) {
       Customer cus1 = new Customer();
       cus1.eat();
       cus1.sleep(8);
    }
}

//客户类
class Customer{

    //属性
    String name;
    int age;
    boolean isMale;

    //方法
    public void eat(){
        System.out.println("客户吃饭");
    }
    public void sleep(int hour){
        System.out.println("休息了"+ hour +"个小时");
    }
    public String getName(){
        return name;
    }
    public String getNation(String Nation){
        String info = "我的国籍" + Nation;
        return Nation;
    }
}