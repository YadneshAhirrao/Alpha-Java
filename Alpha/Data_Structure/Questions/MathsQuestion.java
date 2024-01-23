package Alpha.Data_Structure.Questions;

import java.util.Scanner;

public class MathsQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        //System.out.println(armstrongNumber(a));
        System.out.println(gcdOfNumber(a,b));
        sc.close();
    }

    public static int gcdOfNumber(int a, int b){
        if(b == 0){
            return a;
        }
        return(gcdOfNumber(b, a%b));
    }
    
    public static boolean armstrongNumber(int num){
        int n = num;
        int sum = 0;
        int index = (int) (Math.log10(num)+1);
        while(n > 0){
            int temp = n % 10;
            sum = sum + (int)Math.pow(temp , index);
            n = n /10;
        }

        return num == sum ? true : false;
    }
}
