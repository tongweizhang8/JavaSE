package study_duoxiancheng;
/*
演示线程死锁问题
 */
public class ThreadTestsisuo {
    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                super.run();
            }
        }.start();
    }
}
