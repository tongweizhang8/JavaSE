package study_OverLoad;
/*
定义一个Circle类，包含double型的radius属性代表圆的半径，
一个findArea（）方法返回圆的面积
 */
public class    Circle1 {
    double radius;//半径
    //求圆的面积
    public double findArea(){
        return Math.PI * radius * radius;
    }
}
