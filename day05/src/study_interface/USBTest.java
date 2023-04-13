package study_interface;
/*
接口的使用
1.接口使用上也满足多态性
2.接口，实际上就是定义了一种规范
3.开发中，体会面向接口编程
 */
public class USBTest {
    public static void main(String[] args) {
        Computer c = new Computer();
        //创建了接口的非匿名实现类非匿名对象
        Flash flash = new Flash();
        c.transferData(flash);
        //创建了接口的非匿名实现类的匿名对象
        c.transferData(new Printer());
        //创建了接口匿名实现类的非匿名对象
        USB phone = new USB(){
            @Override
            public void start() {
                System.out.println("手机开始工作");
            }

            @Override
            public void stop() {
                System.out.println("手机结束工作");
            }
        };
        c.transferData(phone);
        //创建了接口的匿名实现类匿名对象
        c.transferData(new USB() {
            @Override
            public void start() {
                System.out.println("mp3开始工作");
            }

            @Override
            public void stop() {
                System.out.println("mp3结束工作");
            }
        });
    }
}

class Computer{
    public void transferData(USB usb){//USB usb = new Flash();
        usb.start();

        System.out.println("具体传输数据的细节");

        usb.stop();
    }
}

interface USB{
    void start();
    void stop();
}
class Flash implements USB {

    @Override
    public void start() {
        System.out.println("U盘开启工作");
    }

    @Override
    public void stop() {
        System.out.println("U盘结束工作");
    }
}
class Printer implements USB{

    @Override
    public void start() {
        System.out.println("打印机开启工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机结束工作");
    }
}
