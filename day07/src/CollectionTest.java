import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/*
一。集合框架的概述
1.集合，数组都是对多个数据进行存储操作的结构，简称java容器
  说明：此时的存储，主要指的是内存层面的存储，不涉及到持久化的存储（.txt,.jpg,.avi,数据库中）
2.1数组在存储多个方面的特点：
    》一旦初始化以后，其长度就确定了
    》数组一旦定义好，其元素的类型也就确定了，我们也就只能操作指定类型的数据了，
     比如：String【】 arr，int【】 arr1，object[] arr2
2.2数组在存储多个数据方面的缺点
    》一旦存储化以后，其长度就不可修改
    》数据中提供的方法非常有限，对于添加，删除，插入数据等操作，非常不变，同时效率不高
    》获取数组中实际元素的个数的需求，数组没有现成的属性或方法可用
二。集合框架
    |----Collection接口：单列集合，用来存储一个一个的对象
        |----list接口：存储有序的，可重复的数据。 --》动态数组
            |----ArrayList,LinkedList,Vector
        |----set接口：存储无序的，不可重复的数据。 --》高中讲的集合
            |----HashSet,LinkedHashSet,TreeSet
    |----Map接口：双列集合，用来存储一对（key-value）一对的数据。 --》高中函数 y = f(x)
            |----HashMap,LinkedHashMap,TreeMap,Hashtable,Properties
 */
public class CollectionTest {
    @Test
    public void test1(){
        Collection coll = new ArrayList();
        //add()(Object e):获取添加元素的个数
        coll.add("AA");
        coll.add("BB");
        coll.add(123);//自动装箱
        coll.add(new Date());
        //size（）
        System.out.println(coll.size());//4
        //addAll(Collection coll):将coll1集合中的元素添加到当前集合中
        Collection coll1 = new ArrayList();
        coll1.add(456);
        coll1.add("BB");
        coll.addAll(coll1);
        System.out.println(coll1.size());//6
        System.out.println(coll);
        //clear():清空集合元素
        coll.clear();
        //isEmpty():判断当前集合是否为空
        System.out.println(coll.isEmpty());
    }
}
