package study_duoxiancheng;

import java.util.concurrent.locks.ReentrantLock;

/*
解决线程安全问题方式3：Lock锁
 */
public class LockTest {
    public static void main(String[] args) {
        Window5 w = new Window5();

        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);
        Thread t3 = new Thread(w);

        t1.start();
        t2.start();
        t3.start();
    }
}
class Window5 implements Runnable {
    private int ticket = 100;
    //1.实例化Reentrantlock
    private ReentrantLock lock = new ReentrantLock(true);

    @Override
    public void run() {
        while (true) {
            try {
                //2.调用Lock方法
                lock.lock();
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ": " + ticket);
                    ticket--;
                } else {
                    break;
                }
            }finally{
                //3.调用解锁方法
                lock.unlock();
            }
        }
    }
}