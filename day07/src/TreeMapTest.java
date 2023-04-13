import org.junit.Test;

import java.util.*;

public class TreeMapTest {
    //向TreeMap中添加key—value，要求key必须是由同一个类创建的对象
    //因为要按照key进行排序：自然排序，定制排序
    //自然排序
    @Test
    public void test1(){
        TreeMap map = new TreeMap();
        map.put(new User("Tom",23),98);
        map.put(new User("Jerry",32),89);
        map.put(new User("Jack",20),76);
        map.put(new User("Rose",18),100);
        Set entrySet = map.entrySet();
        Iterator iterator1 = entrySet.iterator();
        while (iterator1.hasNext()) {
            Object obj = iterator1.next();
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
    //定制排序
    @Test
    public void test2(){
        TreeMap map = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof User && o2 instanceof User){
                    User u1 = (User)o1;
                    User u2 = (User)o2;
                    return Integer.compare(u1.getAge(), u2.getAge());
                }
                throw new RuntimeException("输入类型不匹配");
            }
        });
        map.put(new User("Tom",23),98);
        map.put(new User("Jerry",32),89);
        map.put(new User("Jack",20),76);
        map.put(new User("Rose",18),100);
        Set entrySet = map.entrySet();
        Iterator iterator1 = entrySet.iterator();
        while (iterator1.hasNext()) {
            Object obj = iterator1.next();
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
}
