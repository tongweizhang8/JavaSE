import org.testng.annotations.Test;

import java.util.*;

/*
泛型的使用
1.jdk5.0新增特性
2.在集合中使用泛型：
    总结：
    1）集合接口或集合类在jdk5.0时都修改为带泛型的结构
    2）在实例化集合类时，可以指名具体的泛型类型
    3）知名完以后，在集合类或接口中凡是定义类或接口时内部结构使用到类的泛型的位置，都指定为实例化的泛型类型
        比如：add（E e）---》实例化以后：add（Integer e）
    4）注意点：泛型的类型必须是类，不是基本数据类型，需要用到基本数据类型的位置，拿包装类替换
    5）如果实例化时，没有指明泛型的类型，默认类型java.lang.Object类型
3.如何自定义泛型结构：泛型类，泛型接口，泛型方法
 */
public class GenericTest {
    //在集合中使用之前的情况
    @Test
    public void test1(){
        ArrayList list = new ArrayList();
        //需求：存放学生成绩
        list.add(78);
        list.add(76);
        list.add(89);
        list.add(88);
        //问题一：类型不安全
        //list.add("Tom");
        for(Object score : list){
            //问题二：强转时，可能出现ClassCastException
            int subScore = (Integer) score;
            System.out.println(subScore);
        }
    }
    //在集合中使用泛型的情况
    @Test
    public void test2(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(78);
        list.add(87);
        list.add(99);
        list.add(65);
        //编译时，就会进行类型的检查，保证数据的安全
        //list.add(Tom);
        //方式一
//        for (Integer score : list) {
//            //避免了强转操作
//            int subScore = score;
//            System.out.println(subScore);
//        }
        //方式二
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int subScore = iterator.next();
            System.out.println(subScore);
        }
    }
    //在集合中使用泛型的情况：以HashMap（）为例
    @Test
    public void test3(){
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Tom",87);
        map.put("Jerry",87);
        map.put("Jack",67);
        //map.put(123,"abc");
        //泛型的嵌套
        Set<Map.Entry<String,Integer>> entry = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entry.iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Integer> e = iterator.next();
            String key = e.getKey();
            Integer value = e.getValue();
            System.out.println(key + "=" + value);
        }
    }
}
