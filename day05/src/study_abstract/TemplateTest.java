package study_abstract;
/*
抽象类应用；模板方法的设计模式
 */
public class TemplateTest {
    public static void main(String[] args) {
        SubTemplate t = new SubTemplate();

        t.SpendTime();
    }
}
abstract class Temple{
    //计算某段代码执行所花费的时间
    public void SpendTime(){
        long star = System.currentTimeMillis();
        code();//不确定的部分，易变的部分
        long end = System.currentTimeMillis();
        System.out.println("花费的时间为" + (end - star));
    }
    public abstract void code();

}
class SubTemplate extends Temple{

    @Override
    public void code() {
        for (int i = 1;i < 1000;i++){
            boolean isFlag = true;
            for (int j = 1;j < Math.sqrt(i);j++){
                if (i % j == 0){
                    isFlag = false;
                    break;
                }
                if (isFlag){
                    System.out.println(i);
                }
            }
        }
    }
}
