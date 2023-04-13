package study_Array;

/*
数组冒泡排序的实现
 */
public class BubbleSortTest {
    public static void main(String[] args) {
        int[] arr = new int[]{43,32,76,-98,0,64,33,-21,32,99};
        //冒泡排序
        for(int i = 0;i < arr.length - 1;i++){//少一轮
            for (int j = 0;j < arr.length - 1 - i;j++){//每一轮少一个数
                if(arr[j] > arr[j+1]) {//前面的数比后面的数大，就交换
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+'\t');
        }
    }
}
