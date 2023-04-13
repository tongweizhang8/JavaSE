package study_String;

import org.junit.Test;

import java.util.Date;

/*
jdk8之前日期和时间的api测试
 */
public class DateTimeTest {
    //1.system类中的CurrentTimeMillis（）；
    @Test
    public void test1(){
        long time = System.currentTimeMillis();
        //返回当前时间与1970年1月1日0时0分0秒之间以毫秒为单位的时间差
        //称为时间戳
        System.out.println(time);
    }
    /*
    java.util.Date类
            |-java.sql.Date类
    1.两个构造器的使用
            >构造器1：Date（）创建一个对应当前时间的Data对象
            >构造器2：创建指定毫秒数的data对象
    2.两个方法的使用
            >toString()显示当前的年月日时分秒
            >getData()获取当前对象对应的毫秒数（时间戳）
    3.java.sql.Data对应着数据库中日期类型的变量
            >如何实例化
            >如何将Java.util.Date对象转化为java.sql.Date对象
     */
    @Test
    public void test2(){
        //构造器1：data（）：创建一个对应当前时间的Data对象
        Date date1 = new Date();
        System.out.println(date1.toString());
        System.out.println(date1.getTime());
        //构造器2：创建指定毫秒数的Data对象
        Date date2 = new Date(155030620410L);
        System.out.println(date2.toString());
        //创建java.sql.Date对象
        java.sql.Date date3 = new java.sql.Date(35235325345L);
        System.out.println(date3);
        //如何将Java.util.Date对象转化为java.sql.Date对象
        Date data4 = new java.sql.Date(35235325345L);
        java.sql.Date date5 = (java.sql.Date)data4;
        Date date6 = new Date();
        java.sql.Date date7 = (java.sql.Date)date6;//报错
    }
}
