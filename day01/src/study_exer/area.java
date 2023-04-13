package study_exer;

import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个点的坐标");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.println("请输入第二个点的坐标");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        System.out.println("请输入第三个点的坐标");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();
        /*
			 * 	已知A（x1,y1）,B（x2,y2）
			那么AB之间的距离为√[(X1－X2)^2+(Y1－Y2)^2]
			 * */

        /*
         * 点1至点2的距离
         *  求根的方法：Math.sqrt(double s);
         * */
        double f1 = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        double f2 = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2 - y3));
        double f3 = Math.sqrt((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1));
        /*
         * 计算三角形面积
         * */
        double s = (f1+f2+f3)/2;
        double area = Math.sqrt(s*(s-f1)*(s-f2)*(s-f3));
        System.out.println("area"+area);
    }
}
