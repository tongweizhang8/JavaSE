package study_duoxiancheng;
/*
使用同步方法处理继承Thread类的方式中的线程安全问题
关于同步方法的总结：
1.同步方法仍然涉及到监视器，只是不需要我们显示的声明
2.非静态的同步方法，同步监视器是：this
  静态的同步方法，同步监视器是：当前类本身
 */
class Window4 extends Thread{
    private static int ticket = 100;
    private static Object obj = new Object();
    @Override
    public void run() {
        while (true) {
            show();
    }
}
private static synchronized void show(){
        //private synchronized void show() {//同步监视器 t1，t2，t3此解决方法是错误的
    if (ticket > 0) {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + "卖票，票号为" + ticket);
        ticket--;
        }
    }
}
public class WindowTest4 {
    public static void main(String[] args) {
        Window4 w1 = new Window4();
        Window4 w2 = new Window4();
        Window4 w3 = new Window4();

        w1.setName("窗口一");
        w2.setName("窗口二");
        w3.setName("窗口三");

        w1.start();
        w2.start();
        w3.start();
    }
}
