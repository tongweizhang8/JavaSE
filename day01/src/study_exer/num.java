package study_exer;

import java.util.Scanner;

public class num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = -1;
        int arr[] = {1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == n){
                p = i;
                break;
            }
        }
        if(p >= 0){
            System.out.println(p);
        }else{
            System.out.println("null");
        }
    }

}
