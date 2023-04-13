package study_Object;

import org.junit.Test;

/*
包装类的使用
1.java提供了8种基本数据类型对应的包装类，使得基本数据类型的变量具有类的特征
2.掌握；基本数据类型，包装类，String，三者之间相互切换
 */
public class WrapperTest {
    //基本数据类型 --》包装类：调用包装类构造器
    @Test
    public void test1(){
        int num1 = 10;
        //System.out.println(num1.toString());
        Integer in1 = new Integer(num1);
        System.out.println(in1.toString());
        Integer in2 = new Integer("123");
        System.out.println(in2.toString());
        //报异常
//        Integer in3 = new Integer("123abc");
//        System.out.println(in3.toString());

        Float f3 = new Float(12.3f);
        Float f4 = new Float("12.3");
        System.out.println(f3);
        System.out.println(f4);

        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean("true");
        Boolean b3 = new Boolean("true123");
        System.out.println(b3);//false

        Order2 order = new Order2();
        System.out.println(order.isMale);//false
        System.out.println(order.isFemale);//null
    }

    //包装类——》基本数据类型：调用包装类xxxValue（）
    @Test
    public void test2(){
        Integer in1 = new Integer(12);
        int i1 = in1.intValue();
        System.out.println(i1 + 1);

        Float f1 = new Float(12.3);
        float f2 = f1.floatValue();
        System.out.println(f2 + 1);
    }

    /*
    jdk5.0新特性；自动装箱与拆箱
     */
    @Test
    public void test3(){
//        int num1 = 10;
//        //基本数据类型--》包装类对象
//        method(num1);

        //自动装箱:基本数据类型--》包装类
        int num2 = 10;
        Integer in1 = num2;

        boolean b1 = true;
        Boolean b2 = b1;

        //自动拆箱：包装类--》基本数据类型
        System.out.println(in1.toString());
        int num3 = in1;
    }
    public void method(Object obj){

    }

    //基本数据类型，包装类--》String类型,调用String重载的valueOf（Xxx xxx）
    @Test
    public void test4(){
        int num1 = 10;
        //方式一；连接运算
        String str1 = num1 + " ";
        //方式二；调用String重载的valueOf（Xxx xxx）
        float f1 = 12.1f;
        String str2 = String.valueOf(f1);//12.1

        Double d1 = Double.valueOf(12.4);
        String str3 = String.valueOf(d1);
        System.out.println(str2);
        System.out.println(str3);//12.4
    }

    //String类型--》基本数据类型，包装类调用包装类的paresXxx（）
    @Test
    public void test5(){
        String str1 = "123";
        //错误的情况
//        int num1 = (int)str1;
//        Integer in1 = (Integer) str1;
        //可能会报NumberFormatException
        int num2 = Integer.parseInt(str1);
        System.out.println(num2 + 1);

        String str2 = "true";
        boolean b1 = Boolean.parseBoolean(str2);
        System.out.println(b1);
    }
}
class Order2{
    boolean isMale;
    Boolean isFemale;
}
