package study_String;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
jdk8之前的日期时间的api测试
1.System类中currentTimeMillis（）；
2.java.util.Date和子类java.sql.Date
3.SimpleDateFormat
4.Calendar
 */
public class DateTimeTest1 {
    /*
    SimpleDateFormat的使用：SimpleDateFormat对日期Date类的格式化和解析
    1.两个操作
    1.1格式化：日期--》字符串
    1.2解析：格式化的逆过程，字符串--》日期
    2.SimpleDateFormat的实例化
     */
    @Test
    public void testSimpleDateFormat() throws ParseException {
        //实例化SimpleDateFormat
        SimpleDateFormat sdf = new SimpleDateFormat();
        //格式化：日期--》字符串
        Date date = new Date();
        System.out.println(date);
        String format = sdf.format(date);
        System.out.println(format);
        //解析，格式化的逆过程，字符串--》日期
        String str = "2012-04-05";
        Date date1 = sdf.parse(str);
        System.out.println(date1);
        //按照指定的方式格式化和解析
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        //格式化
        String format1 = simpleDateFormat1.format(date);
        System.out.println(format1);
        //解析
        Date date2 = simpleDateFormat1.parse("2012-03-08 11:33:03");
        System.out.println(date2);

    }
    /*
        练习一：字符串“2020-09-08”转换为java.sql.Date
    */
    @Test
    public void testExer() throws ParseException {
        String birth = "2020-09-08";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf1.parse(birth);
        System.out.println(date);
        java.sql.Date birthDate = new java.sql.Date(date.getTime());
        System.out.println(birthDate);
    }
    /*
    Calander日历类（抽象类）的使用
     */
    @Test
    public void testCalculate(){
        //1.实例化
        //方式一；创建其子类的对象（GregorianCalender）的对象
        //方式二：调用其静态方法getInstance（）
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getClass());
        //常用方法
        //get()
        int days = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);
        System.out.println(cal.get(Calendar.HOUR_OF_DAY));
        //set()
        cal.set(Calendar.DAY_OF_MONTH,22);
        days = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);
        //add()
        cal.add(Calendar.DAY_OF_MONTH,3);
        days = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);
        //getTime():日历类--》Date
        Date date = cal.getTime();
        System.out.println(date);
        //setTime()：Date——》日历类
        Date date1 = new Date();
        cal.setTime(date1);
        days = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);
    }
}
