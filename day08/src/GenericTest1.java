import org.testng.annotations.Test;

import java.beans.PersistenceDelegate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

/*
如何自定义泛型结构：泛型类，泛型接口，泛型方法
1.关于自定义泛型类，泛型接口
 */
public class GenericTest1 {
    //如果定义了泛型类，实例化没有指明的泛型，则认为此泛型类型为Object类型
    @Test
    public void test1() {
        Order order = new Order();
        order.setOrderT(123);
        order.setOrderT("ABC");
        //建议：实例化时指明类的泛型
        Order<String> order1 = new Order<String>("orderAA",1001,"order:AA");
        order1.setOrderT("AA:hello");
    }
    @Test
    public void test2() {
        SubOrder sub1 = new SubOrder();
        //由于子类在继承带泛型的父类时，指明了泛型类型。则实例化子类对象时，不在需要指明泛型
        sub1.setOrderT(1122);
        SubOrder1<String> sub2 = new SubOrder1<>();
        sub2.setOrderT("Order2");
    }
    @Test
    public void test3(){

        ArrayList<String> list1 = null;
        ArrayList<Integer> list2 = null;
        //泛型不同的引用不能相互赋值
        //list1 = list2;
        Person p1 = new Person();
        Person p2 = new Person();
        p1 = p2;
    }
    //测试泛型方法
    @Test
    public void test4(){
        Order<String> order = new Order<>();
        Integer[] arr =  new Integer[]{1,2,3,4};
        //泛型方法在调用时，指明泛型参数的类型
        List<Integer> list = order.copyFromArrayToList(arr);
        System.out.println(list);
    }
}
