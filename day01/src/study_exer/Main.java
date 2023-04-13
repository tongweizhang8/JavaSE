package study_exer;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] name = new String[n];
        int[] score = new int[n];
        for (int i = 0; i < n; i++) {
            name[i] = scanner.next();
            score[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (score[j] < score[j + 1]) {
                    int score2 = score[j];
                    score[j] = score[j + 1];
                    score[j + 1] = score2;

                    String name2 = name[j];
                    name[j] = name[j + 1];
                    name[j + 1] = name2;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                System.out.println(name[i-1] + score[i -1]);
            }else {
                System.out.println(name[i] + score[i]);
            }
        }
    }
}