/*
static关键字应用
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();

        System.out.println(c1.getId());
        System.out.println(c2.getId());

        System.out.println("创建圆的个数为" + Circle.getTotal());
    }
}
class Circle{
    private double radius;
    private int id;//自动赋值

    public Circle(){
        id = init++;
        total++;
    }
    public Circle(double radius){
        this();
        this.radius = radius;
//        id = init++;
//        total++;
    }

    private static int total;//记录创建圆的个数
    private static int init = 1001;//static声明的属性被所有声明的对象共享

    public double findArea(){
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getTotal() {
        return total;
    }
}
