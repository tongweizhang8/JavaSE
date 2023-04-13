package study_duoxiancheng;
/*
多线程的创建：方式一：继承于Thread类
1.创建一个继承Thread类的子类
2.重写Thread类的run（）
3.创建Thread类子类的对象
4.通过此对象调用start（）
例子；遍历100以内所有的偶数
 */
//1.创建一个继承Thread类的子类
class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
public class ThreadTest {
    public static void main(String[] args) {
        //创建Thread类子类的对象
        MyThread myThread1 = new MyThread();
        //通过此对象调用start（）1)启动当前线程 2）调用当前线程的run方法
        myThread1.start();
        //问题1；我们不能通过直接调用run（）的方式启动线程
        //myThread.run();
        ////问题二：再启动一个线程，遍历100以内的偶数。不可以还让已经start()的线程去执行。会报IllegalThreadStateException
        //myThread.start();
        MyThread myThread2 = new MyThread();
        myThread2.start();
        //如下操作仍是在main线程中执行的
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread() + ":" + i + "hello");
            }
        }
    }
}
