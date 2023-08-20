package Alpha.Basics;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // pattern1(5);
        // pattern2(5);
        // pattern3(5);
        pattern4(5);

        sc.close();
    }

    public static void pattern1 (int num) {
        int a = 1;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(a+" ");
                
            }
            System.out.println();
            a++;
        }
    }
    public static void pattern2 (int num) {
        for (int i = 0; i < num; i++) {
            for (int j = i; j < num; j++) {
                System.out.print("* ");
                
            }
            System.out.println();
        }
    }

    public static void pattern3 (int num) {
        int a = 1;
        for (int i = 0; i < num; i++) {
            for (int j = i; j <num; j++) {
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
            a=1;
        }
    }

    public static void pattern4 (int num){
        for (int i = 0; i < num; i++) {
            
                //Space
                for (int j1 = 0; j1 < num-i-1; j1++) {
                    System.out.print("  ");
                }

                //Star
                for (int j2 = 0; j2 < 2*i+1; j2++) {
                    System.out.print("* ");
                }

                //space
                for (int j1 = 0; j1 < num-i-1; j1++) {
                    System.out.print("  ");
                }

                System.out.println();
            
        }
    }
}
