package study_duoxiancheng;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/*
创建多线程方式三：实现Callable接口

如何理解实现Callable接口的方式创建多线程比实现Runnable接口创建多线程方式强大
1.call（）可以有返回值的
2.call（）可以抛出异常，被外面的操作捕获，获取异常的信息
3.Callable支持泛型
 */

public class ThreadNew {
    //3.创建callable接口实现类对象
    public static void main(String[] args) {
        NumThread numThread = new NumThread();

        //4.将此Callable接口实现类的对象传递到FutureTask构造器中，创建FutureTask的对象
        FutureTask futureTask = new FutureTask(numThread);

        //5.将futureTask的对象作为参数传递到Thread类中，创建Thread类对象，并调用start（）
        new Thread(futureTask).start();

        try {
            //6.获取Callable中call返回值
            //get（）返回值即为FutureTask构造器
            Object sum = futureTask.get();
            System.out.println(sum);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }catch (ExecutionException e){
            e.printStackTrace();
        }
    }
}
//1.创建一个实现Callable接口的实现类
class NumThread implements Callable<Integer> {

    //2.实现call方法，将此线程需要执行操作声明在caii（）中
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                sum += i;
            }
        }
        return sum;
    }
}