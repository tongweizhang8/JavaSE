package study_Array;

/*
二维数组的使用
1.对于二维数组的理解我们可以看成是一维数组array1有作为另一个一维数组array2的元素存在
其实从数组底层的运行机制来看，其实没有多为数组
2.二维数组的使用
1）二维数组的声明和初始化
2）如何调用数组的指定位置元素
3）如何获取数组的长度
4）如何遍历数组
5）数组元素的默认初始胡值
6）数组的内存解析
 */
public class ArrayTest2 {
    public static void main(String[] args) {
        //二维数组的声明和初始化
        int[] arr = new int[]{1,2,3};//一维数组
        //静态初始化
        int[][] arr1 =  new int[][]{{1,2,3},{4,5},{6,7,8}};
        //动态初始化1
        String[][] arr2 = new String[3][2];
        //动态初始化2
        String[][] arr3 = new String[3][];
        //正确的写法
        int[] arr4 = {1,2,3,4,5};//类型推断
        int[][] arr5 = {{1,2,3},{4,5},{6,7,8}};

        //如何调用数组指定位置的元素
        System.out.println(arr1[0][1]);//2
        System.out.println(arr2[1][1]);//null

        arr3[1] =new String[4];
        System.out.println(arr3[1][0]);

        //获取数组的长度
        System.out.println(arr1.length);//3
        System.out.println(arr1[0].length);//3
        System.out.println(arr1[1].length);//2

        //如何遍历二维数组
        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr1[i].length; j++){
                System.out.println(arr1[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
