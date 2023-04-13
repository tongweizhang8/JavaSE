import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
集合元素的遍历操作，使用迭代器IteratorTest接口
1.内部的方法：hasNext()和next（）
2.集合对象每次调用iterator（）方法都得到一个全新的迭代器对象
  默认游标都在集合的第一个元素之前
3.内部定义了remove（），可以在遍历的时候，删除集合中的元素，此方法不同于直接调用元素remove（）

 */
public class IteratorTest {
    @Test
    public void test1(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry", 20));
        coll.add(new String("Tom"));
        coll.add(false);
        Iterator integer = coll.iterator();
        //方式一
//        System.out.println(integer.next());
//        System.out.println(integer.next());
//        System.out.println(integer.next());
//        System.out.println(integer.next());
//        System.out.println(integer.next());
//        //报异常NoSuchElementException
//        //System.out.println(integer.next());
        //方式二(不推荐）
        for (int i = 0; i <coll.size(); i++) {
            System.out.println(integer.next());
        }
        //方式三（推荐）
        while (integer.hasNext()){
            System.out.println(integer.next());
        }
    }
    @Test
    public void test2(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry", 20));
        coll.add(new String("Tom"));
        coll.add(false);
        //错误方式1
//        Iterator integer = coll.iterator();
//        while (integer.next() != null) {
//            System.out.println(integer.next());
//        }
        //错误方式2
//        while (coll.iterator().hasNext()) {
//            System.out.println(coll.iterator().next());
//        }
    }
    //测试Iterator中remove（）
    @Test
    public void test3(){
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry", 20));
        coll.add(new String("Tom"));
        coll.add(false);
        //删除集合中“Tom”
        Iterator integer = coll.iterator();
        while (integer.hasNext()){
            Object obj = integer.next();
            if ("Tom".equals(obj)){
                integer.remove();
            }
        }
        //遍历集合
        integer = coll.iterator();
        while (integer.hasNext()){
            System.out.println(integer.next());
        }
    }
}
