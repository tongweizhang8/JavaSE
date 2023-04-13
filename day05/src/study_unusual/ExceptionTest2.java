package study_unusual;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
异常处理的方式2；throws + 异常类型
1."throws + 异常类型"写在方法声明处，指名此方法执行时，可能会抛出的异常类型，
  一旦方法体执行时，出现异常仍会在一个异常代码出生成一个异常类的对象，
  此对象满足throws后异常类型时，就会抛出，异常代码后续代码不再执行
2.体会：try—catch-finally；真正将一场给处理掉了
      throws的方式只是将异常抛给了方法的调用者，并没有真正将异常处理掉
3.开发中如何选择使用try-catch-finally，还是throws
    3.1如果父类中被重写的方法没有throws方法处理异常，则子类重写的方法也不能使用throws
    ，意味着如果子类重写的方法中有异常，必须用try-catch-finally方式处理
    3.2执行的方法a中，先后又调用了另外几个方法，这几个方法是递进方式执行的，我们建议这几个方法使用throws
    的方法进行处理，而执行的方法a可以考虑使用try-catch-finally方法进行处理
 */
public class ExceptionTest2 {
    public static void main(String[] args) throws IOException {
        try {
            method2();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void method2() throws IOException {
        method1();
    }
    public static void method1() throws FileNotFoundException, IOException {
        File file = new File("hello.txt");
        FileInputStream fis = new FileInputStream(file);

        int data = fis.read();
        while(data != -1){
            System.out.print((char)data);
            data = fis.read();
        }
        fis.close();
    }
}
