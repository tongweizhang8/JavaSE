package study_interface;

public class ComparableCircleTest {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(3.4);
        ComparableCircle c2 = new ComparableCircle(3.6);
        int CompareValue = c1.compareTo(c2);
        if (CompareValue > 0) {
            System.out.println("c1大");
        } else if (CompareValue < 0) {
            System.out.println("c2大");
        }else {
            System.out.println("一样大");
        }
        int compareValue1 = c1.compareTo(new String("AA"));
        System.out.println(compareValue1);
    }
}
