package study_duoxiancheng;
/*
练习；创建2个分线程，其中一个线程遍历100以内的偶数，另一个线程遍历100以内奇数
 */
public class ThreadDemo {
    public static void main(String[] args) {
        MyThread1 m1 = new MyThread1();
        MyThread2 m2 = new MyThread2();

        m1.start();
        m2.start();
    }
}
class MyThread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}