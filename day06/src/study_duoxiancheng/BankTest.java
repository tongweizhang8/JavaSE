package study_duoxiancheng;
/*
使用同步机制将单例模式中的懒汉式改写成为线程安全的
 */
public class BankTest {
}
class Bank {
    private Bank(){}
    private static Bank instance = null;
    private static synchronized Bank getInstance() {
        //方式一：效率稍差
//        synchronized (Bank.class) {
//            if (instance == null) {
//                instance = new Bank();
//            }
//            return instance;
//        }
        if (instance == null) {
            synchronized (Bank.class) {
                if (instance == null) {
                    instance = new Bank();
                }
            }
        }
        return instance;
    }
}
