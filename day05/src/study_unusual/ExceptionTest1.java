package study_unusual;

import org.testng.annotations.Test;

/*
异常的处理；抓抛模型
过程1；“抛”；程序在正常执行的过程中，一旦出现异常，就会在异常代码出生成对应异常对象
           并将此对象抛出一旦抛出对象以后，其后代码不在执行
      关于异常对象的产生；1）系统自动生成的异常对象
                      2）手动生成的异常对象并抛出（throw）
过程2；“抓”；可以理解为异常处理方式，1）try—catch—finally 2）throws
            1）try{
            //可能出现异常的代码
            }catch（异常类型1 变量名1）{
            //处理异常方式1
            }catch（异常类型2 变量名2）{
            //处理异常方式2
            }
            finally{
            //一定会执行的代码
            }

说明；
1.finally是可选的
2.使用try将可能出现的异常代码包装起来，在执行过程中，一旦出现异常，就会生成一个异常类的对象，根据此对象的类型，去catch中匹配
3.一旦try中的异常对象匹配到某一个catch时，就进入catch中进行异常处理，一旦处理完成，
  就跳出当前的try-catch结构（在没有写finally的情况下),继续执行其后的代码
4.catch中的异常类型，如果没有子父类关系，则谁声明在上，谁声明在下无所谓，
  如果满足子父类关系，则要求子类一定声明在父类的上面，否则报错
5.常用的异常处理方法；1)String getMessage（）    2）printStackTrace（）
6.在try结构中声明的变量，在出了try结构以后，就不能被调用
7.try-catch-finally结构可以嵌套

体会；1.使用try-catch-finally处理编译时异常使得程序在编译时就不再报错，但是运行时仍可能报错，
     相当于我们使用try-catch-finally将一个编译时出现的异常，延迟到运行时出现
     2.开发中，由于运行异常比较常见，所以就不针对运行异常编写try-catch-finally，针对于编译时异常，一定要考虑异常处理
 */
public class ExceptionTest1 {
    @Test
    public void test1(){
        String str1 = "123";
        str1 = "abc";
        int num = 0;
        try {
            num = Integer.parseInt(str1);
            System.out.println("hello1");
        }catch (NumberFormatException e) {
            System.out.println("出现数值转换异常");
            System.out.println(e.getMessage());
            //printStackTrace();
            e.printStackTrace();
        }catch (NullPointerException e) {
            System.out.println("出现空指针异常");
        }
        System.out.println("hello2");
    }
}
