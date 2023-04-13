package study_abstract;
/*
在局部内部类的方法中，（比如show），如果调用局部内部类所声明的方法中的局部变量的话（比如method方法），
要求此局部变量声明为final的
 */
public class InnerClassTest3 {
    public void method(){
        //局部变量
        int num = 0;//jdk8之后可以省略final
        class AA{
            public void show(){
                //num = 1; Variable 'num' is accessed from within inner class, needs to be final or effectively final
                System.out.println(num);
            }
        }
    }
}
