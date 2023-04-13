package study_duoxiancheng;
/*
例子；创建三个窗口卖票，总票数为100，使用runnable接口的方式
1.问题：卖票过程中，出现了重票，错票--》出现了线程安全问题
2.问题出现的原因：当某个线程操作车票过程中，尚未完成操作时，其他线程参与进来，也操作车票。
3.如何解决：当一个线程a在操作ticket时候，其他线程不能参与进来，直到线程a操作完成ticket时，
          其他线程才可以开始操作ticket，这种情况即使线程a出现阻塞，也不能被改变
4.java中，通过同步机制，来解决线程安全问题
方式一：同步代码块
    synchronized（同步监视器）{
    //需要被同步的代码
    }
    说明：1.操作共享数据的代码，即为需要被同步的代码-》不能包含代码多了，也不能包含代码少了
         2.共享数据：多个线程共同操作的变量
         3.同步监视器：俗称锁，在任何一个类的对象，都可以充当锁
         补充：在runnable接口创建多线程的方式中，我们可以考虑使用this充当监视器
方式二：同步方法
5.同步的方法，解决了线程的问题。--》好处
  操作同步代码时，只有一个线程参与，其他线程等待，相当于是一个单线程的过程，效率低--》局限
存在线程安全问题，待解决
 */
class Window1 implements Runnable {

    private int ticket = 100;
    Object obj = new Object();
    @Override
    public void run() {
        while (true) {
            synchronized (obj) {   
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":卖票，票号为" + ticket);
                    ticket--;
                } else {
                    break;
                    }
                }
            }
        }
    }

    public class WindowTest1 {
        public static void main(String[] args) {
            Window1 window = new Window1();
            Thread thread1 = new Thread(window);
            Thread thread2 = new Thread(window);
            Thread thread3 = new Thread(window);
            thread1.setName("窗口1");
            thread2.setName("窗口2");
            thread3.setName("窗口3");
            thread1.start();
            thread2.start();
            thread3.start();
        }
    }