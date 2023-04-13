package study_Array;

/*
数组元素的默认初始化值
数组元素是整形；0；
数组元素是浮点型；0.0；
数组元素是char型；0或“\u0000”，而非“0”
数组元素是boolean型；fause；
 */
public class ArrayTest1 {
    public static void main(String[] args) {
        //数组元素的默认初始化值
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("****************");
        short[] arr1 = new short[4];
        for (int i = 0; i < arr1.length; i++){
            System.out.println(arr1[i]);
        }
        System.out.println("****************");
        char[] arr2 = new char[4];
        for (int i = 0; i < arr2.length; i++){
            System.out.println(arr2[i]);
        }
        System.out.println("****************");
        boolean[] arr3 = new boolean[5];
            System.out.println(arr3[0]);
    }
}
