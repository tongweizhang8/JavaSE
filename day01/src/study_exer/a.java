package study_exer;
    import java.io.*;
    import java.util.Scanner;

    public class a {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            System.out.println(isPalindrome(str));
        }

        public static boolean isPalindrome(String str) {
            StringBuilder s1 = new StringBuilder(str);
            s1.reverse();
            String s2 = new String(s1);
            if (str.equals(s2)) {
                return true;
            } else {
                return false;
            }
        }
    }