import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
Collections:操作Collection，Map的工具类
面试题：Collection和Collections的区别？  接口和工具类
 */
public class CollectionsTest {
    /*
    reverse(List):反转List中元素的顺序
    shuffle(List):对List集合元素进行随机排序
    sort(List):根据元素的自然顺序对指定的List集合元素按升序排序
    sort(List,Comparator):根据指定的Comparator产生的顺序对List集合元素进行排序
    sort(List，int，int):根据指定list集合中的i处元素和j处元素进行交换
    Object max(Collection):根据元素的自然顺序，返回给定集合中的最大元素
    Object max(Collection,Comparable):根据Comarator指定的顺序，返回给定集合的最大元素
    Object min(Collection)
    Object min(Collection,Comparator)
    int frequency(Collection,Object):返回指定集合中指定元素的出现次数
    void copy(List dest,List src):将src中的内容复制到dest中
    boolean replaceAll(List list，Object oldVal，Object newVal)：使用新值替换 List 对象的所有旧值
     */
    @Test
    public void test1(){
        List list = new ArrayList();
        list.add(123);
        list.add(43);
        list.add(765);
        list.add(765);
        list.add(765);
        list.add(-98);
        list.add(0);
        System.out.println(list);
        //Collections.reverse(list);
        //Collections.shuffle(list);
        //Collections.sort(list);
        //Collections.swap(list,1,2);
        Collections.frequency(list,765);
        System.out.println(list);
    }
    @Test
    public void test2(){
        List list = new ArrayList();
        list.add(123);
        list.add(43);
        list.add(765);
        list.add(765);
        list.add(765);
        list.add(-98);
        list.add(0);
        //报异常：IndexOutOfBoundsException("Source does not fit in dest");
//        List dest = new ArrayList();
//        Collections.copy(dest,list);
        List dest = Arrays.asList(new Object[list.size()]);
        System.out.println(dest.size());//list.size();
        System.out.println(dest);
        /*
        Collections类中提供了多个synchronizedXxx()方法，该方法可使将指定集合包装成线程同步的集合
        从而可以解决多线程并发访问集合时的线程安全问题
         */
        //返回的list1即为线程安全的list
        List list1 = Collections.synchronizedList(list);
    }
}
