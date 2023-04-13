package study_String;

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

/*
jdk8中日期和时间api测试
 */
public class JDK8DateTimeTest{
    @Test
    public void testDate(){
        //偏移量
        Date date1 = new Date(2020 - 1900,2 - 1,8);
        System.out.println(date1);
    }
    /*
    LocalDate，LocalTime，LocalDateTime的使用
    说明：1.localDateTime相较于LocalDate和LocalTime使用频率高
         2.类似于calender
     */
    @Test
    public void test1(){
        //now():获取当前日期，时间，日期+时间
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);
        //of():设置指定的年月日时分秒，没有偏移量
        LocalDateTime localDateTime1 = LocalDateTime.of(2020,11,2,11,12,13);
        System.out.println(localDateTime1);
        //getXxx():
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getDayOfYear());
        System.out.println(localDateTime.getMonthValue());
        System.out.println(localDateTime.getMinute());
        System.out.println(localDateTime.getMonth());
        //体现不可变性
        LocalDate localDate1 = localDate.withDayOfMonth(22);
        System.out.println(localDate);
        System.out.println(localDate1);
        LocalDateTime localDateTime2 = localDateTime.withHour(4);
        System.out.println(localDateTime);
        System.out.println(localDateTime2);
        LocalDateTime localDateTime3 = localDateTime.plusMonths(3);
        System.out.println(localDateTime);
        System.out.println(localDateTime3);
        LocalDateTime localDateTime4 = localDateTime.minusDays(8);
        System.out.println(localDateTime);
        System.out.println(localDateTime4);
    }
    /*
    instance的使用
     */
    @Test
    public void test2(){
        //now()获取本初子午线对应的标准时间
        Instant instant = Instant.now();
        System.out.println(instant);
        //添加时间的偏移量
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);
        //toEpochMilli():获取自1970年1月1日0时0分0秒开始的毫秒数
        long milli = instant.toEpochMilli();
        System.out.println(milli);
        //ofEpochMilli():通过给定的毫秒数，获取instant实例--》date（long millis）
        Instant instant1 = Instant.ofEpochMilli(1567890765432L);
        System.out.println(instant1);
    }
    /*
    DateTimeFormatter:格式化或解析日期，时间
    类似于simpleDateFormatter
     */
    @Test
    public void test3(){
        //        方式一：预定义的标准格式。如：ISO_LOCAL_DATE_TIME;ISO_LOCAL_DATE;ISO_LOCAL_TIME
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        //格式化:日期-->字符串
        LocalDateTime localDateTime = LocalDateTime.now();
        String str1 = formatter.format(localDateTime);
        System.out.println(localDateTime);
        System.out.println(str1);//2019-02-18T15:42:18.797

        //解析：字符串 -->日期
        TemporalAccessor parse = formatter.parse("2019-02-18T15:42:18.797");
        System.out.println(parse);

//        方式二：
//        本地化相关的格式。如：ofLocalizedDateTime()
//        FormatStyle.LONG / FormatStyle.MEDIUM / FormatStyle.SHORT :适用于LocalDateTime
        DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        //格式化
        String str2 = formatter1.format(localDateTime);
        System.out.println(str2);//2019年2月18日 下午03时47分16秒


//      本地化相关的格式。如：ofLocalizedDate()
//      FormatStyle.FULL / FormatStyle.LONG / FormatStyle.MEDIUM / FormatStyle.SHORT : 适用于LocalDate
        DateTimeFormatter formatter2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        //格式化
        String str3 = formatter2.format(LocalDate.now());
        System.out.println(str3);//2019-2-18


//       重点： 方式三：自定义的格式。如：ofPattern(“yyyy-MM-dd hh:mm:ss”)
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        //格式化
        String str4 = formatter3.format(LocalDateTime.now());
        System.out.println(str4);//2019-02-18 03:52:09

        //解析
        TemporalAccessor accessor = formatter3.parse("2019-02-18 03:52:09");
        System.out.println(accessor);


    }
}
