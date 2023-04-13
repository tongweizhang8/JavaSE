public class Cylinder extends Circle{
    private double length;

    public Cylinder(){
        length = 1.0;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double findVomule(){
        //return Math.PI * getLength() *getLength() * getLength();
        return super.findArea() * getLength();
    }
    public double findArea(){//返回圆柱表面积
        return Math.PI * getRadius() * getRadius() * 2 + 2 * Math.PI * getRadius() * getLength();
    }
}
