import org.testng.annotations.Test;

import java.util.*;

import static com.sun.deploy.security.BlockedDialog.show;

/*
1.泛型在继承性方面的体现
  虽然类A是类B的父类，但是G<A>和G<B>二者不具备子父类关系，二者是并列关系
  补充：类A是类B的父类，A<G>,B<G>
 */
public class GenericTest2 {
    @Test
    public void test1(){
        Object obj = null;
        String str = null;
        Object[] arr1 = null;
        String[] arr2 = null;
        arr1 = arr2;
        List<Object> list1 = null;
        List<String> list2 = null;
        //此时的list1和list2的类型不具有子父类关系
        //编译不通过
        //list1 = list2;
        //编译不通过
//        Date date = new Date();
//        str = date;
        /*
        反证法：
        假设list1 = list2；
            list.add(123);导致混入非String数据，出错；
         */
        show(list1);
        show1(list2);
    }

    private void show1(List<String> list) {
    }

    private void show(List<Object> list) {
    }
    @Test
    public void test2(){
        AbstractList<String> list1 = null;
        List<String> list2 = null;
        ArrayList<String> list3 = null;
        list1 = list3;
        list2 = list3;
    }
    /*
    2.通配符的使用
      通配符：？
      类A是类B的父类，G<A>和G<B>是没有关系的，二者共同的父类是：G<?>
     */
    @Test
    public void test3(){
        List<Object> list1 = null;
        List<String> list2 = null;
        List<?> list = null;
        list = list1;
        list = list2;
        print(list1);
        print(list2);
        List<String> list3 = null;
        list3.add("AA");
        list3.add("BB");
        list3.add("CC");
        list = list3;
        //添加(写入）：对于List<?>就不能向其内部添加数据
        //除了添加null之外
//        list.add("DD");
//        list.add("?");
        list.add(null);
        //获取（读取）:允许读取数据，读取的数据类型为Object
        Object o  = list.get(0);
        System.out.println(o);
    }
    public void print(List<?> list) {
        Iterator<?> iterator = list.iterator();
        while(iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println(obj);
        }
    }
    /*
    3.有限制条件的通配符的使用
    ？ extends Person：
                G<? extends A>可以作为G<A>和G<B>的父类，其中B是A的子类
    ？ super Person：
                G<? super A>可以作为G<A>和G<B>的父类，其中A是B的子类
     */
    @Test
    public void test4(){
        List<? extends Person1> list1 = null;
        List<? super Person1> list2 = null;
        List<Student1> list3 = null;
        List<Person1> list4 = null;
        List<Object> list5 = null;
        list1 = list3;
        list1 = list4;
        //list1 = list5;
        //list2 = list3;
        list2 = list4;
        list2 = list5;
        //读取数据
        list1 = list4;
        Person1 p = list1.get(0);
        //编译不通过
        //Student1 s = list1.get(0);
        list2 = list4;
        Object obj = list2.get(0);
        //编译不通过
        //Person p1 = list2.get(0);
        //写入数据
        //编译不通过
        //list1.add(new Student1());
        list2.add(new Person1());
        list2.add(new Student1());
    }

}
