package study_Array;

/*
杨辉三角
 */
public class YangHuiTest {
    public static void main(String[] args) {
        //声明并初始化二维数组
        int[][] yanghui = new int[10][];
        //给数组的元素赋值
        for (int i = 0; i <yanghui.length; i++) {
            yanghui[i] = new int[i+1];
            //给首末元素赋值
            yanghui[i][0] = 1;
            yanghui[i][i] = 1;
            //给每行非首末元素赋值
            if (i > 1){
                for (int j = 0; j < yanghui[i].length-1; j++) {
                    yanghui[i][j] = yanghui[i-1][j-1]+yanghui[i-1][j];
                }
            }
        }
        //遍历二维数组
        for (int i = 0; i <yanghui.length; i++) {
            for (int j = 0; j <yanghui[i].length; j++) {
                System.out.println(yanghui[i][j] + " ");
            }
            System.out.println();
        }
    }
}
