
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // int sum = a+b;
        // System.out.println(sum);
        // float r = sc.nextFloat();
        // float area = 3.14f * r * r;
        // System.out.println(area);

        // short a = 5;
        // byte b = 25;
        // char c = 'c';
        // byte bt = (byte)(a + b + c);
        // System.out.println(bt);

        // int a = 10;
        // float b = 20.25f;
        // long c = 25;
        // double d = 30.0000;
        // double ans = a+b+c+d;
        // System.out.println(ans);

        // byte b = 5;
        // byte a = (byte) (b * 2);
        // System.out.println(a);

        /*
         * Entercostof3itemsfromtheuser(usingfloatdatatype)-apencil,apenandan eraser.
         * You have to output the total cost of the items back to the user as their
         * bill.(Add on : You can also try adding 18% gst tax to the items in the bill
         * as an advanced problem)
         */

        // float pencile = sc.nextFloat();
        // float pen = sc.nextFloat();
        // float eraser = sc.nextFloat();

        // float sum = pen + pencile + eraser;
        // System.out.println("Total is : " +sum);
        // sum = 0.18f * sum + sum;
        // System.out.println("Total after 18% of GST : " +sum);

        // int $ = 10;
        // System.out.println($);

        // int a , b, c;
        // a = b = c = 2;
        // System.out.println(a+" "+b+" "+c);4

        // int a = 300;
        // int b = 40;
        // int c = a > b ? a++ : --b;
        // System.out.println(c);

        // String s = a>b?"Yadnesh":"Ahirrao";
        // System.out.println(s);

        // Ternary Operator
        // int num = sc.nextInt();
        // int isEven = (num%2==0) ? 1 : 0;

        // Factorial of a number
        // int fact = 1;
        // int num = sc.nextInt();
        // for (int i = 1; i <= num; i++) {
        // fact = fact * i;
        // }
        // System.out.println(fact);

        // for(int i = 0; i <= 5; i++ ) {
        // System.out.println("i = " + i );
        // }

        // do {
        // int num = sc.nextInt();
        // if(num%10==0){
        // break;
        // }
        // System.out.println(num);
        // }while(true);

        // do {
        // int num = sc.nextInt();
        // boolean isprime = true;
        // for (int i = 2; i*i <= num; i++) {
        // if (num % i == 0) {
        // isprime = false;
        // break;
        // }
        // }
        // if (isprime) {
        // System.out.println("Number Is Prime");
        // } else {
        // System.out.println("Number is Not Prime");
        // }
        // } while (true);

        // //Advance SwitchCase (used in java 13 and above versions)
        // int num = 4;
        // switch (num) {
        // case 1,2,3 -> System.out.println("Your I/P is 1,2,3");
        // case 4 -> System.out.println("I/P is 4");
        // default -> System.out.println("Error");
        // }

        /* Patterns Questions */

        /*
         *
         * *
         * * *
         * * * *
         * 
         */

        // int num = 5;
        // for (int r = 1; r <= num; r++) {
        // for (int c = 1; c <= r; c++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        /*
         * * * * *
         * * * *
         * * *
         * *
         *
         */
        // int num = 5;
        // for (int row = 1; row <= num; row++) {
        // for (int col = num; col > 0; col--) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // bintodec(1111);
        // dectobin(15);
        // digitsum(121);

        // printhrec(4, 5);
        // rothpyd1(5);
        // invhpyd2(5);
        // floydstriangle(5);
        // zeroonepattern(5);
        // butterflypattern(8);
        // butterfly(5);
        // solidrombus(5);
        // diamondpattern(5);
        // numberpiramid(5);
        // numpyramid(5);
        palindromicpattern(5);
        sc.close();
    }

    // public static void PrintLine(){
    // System.out.println("Hello Yadnesh You Are in Function ");
    // }

    // converting Number Binary to Decimal Number
    public static void bintodec(int num) {
        int pow = 0;
        int dec = 0;

        while (num > 0) {
            int LD = num % 10;
            dec = dec + (LD * (int) Math.pow(2, pow));
            pow++;
            num = num / 10;
        }

        System.out.println(dec);
    }

    // Converting Decimal Number to Binary Number.
    public static void dectobin(int num) {
        int pow = 0;
        int bin = 0;

        while (num > 0) {
            int last = num % 2;
            bin = bin + (last * (int) Math.pow(10, pow));
            pow++;
            num = num / 2;
        }
        System.out.println(bin);
    }

    // Write a Java method to compute the sum of the digits in an integer
    public static void digitsum(int num) {
        int sum = 0;
        while (num > 0) {
            int last = num % 10;
            sum += last;
            num /= 10;
        }

        System.out.println(sum);
    }

    // Advance Patterns
    /*
     * Hollow Rectangle
     * 
     * * * * *
     * *
     * *
     * *
     * * * * *
     * 
     */

    public static void printhrec(int row, int col) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == 0 || j == 0 || i == row - 1 || j == col - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // Rotated Half Pyramid

    /*
     * reverse
     * 
     * *
     * *
     * * *
     * * * *
     * * * * *
     */

    public static void rothpyd1(int num) {
        for (int i = 1; i <= num; i++) {
            // spaces
            for (int j = 1; j <= num - i; j++) {
                System.out.print("  ");
            }

            // Stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void invhpyd2(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // Floyd's Triangle

    /*
     * 1
     * 2 3
     * 4 5 6
     * 7 8 9 10
     * 11 12 13 14 15
     */

    public static void floydstriangle(int num) {
        int a = 1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a + " ");
                a = a + 1;
            }
            System.out.println();
        }
    }

    // 0-1 Pattern

    /*
     * 1
     * 0 1
     * 1 0 1
     * 0 1 0 1
     * 1 0 1 0 1
     */
    public static void zeroonepattern(int num) {
        int a = 1;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                a = 0;
            } else {
                a = 1;
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(a + " ");
                // if (a==0) {
                // a=1;
                // } else {
                // a=0;
                // }
                a = 1 - a;
            }
            System.out.println();
        }
    }

    public static void butterflypattern(int num) {
        for (int i = 1; i <= num; i++) {
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            for (int j = 1; j <= 2 * (num - i); j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = num; i > 0; i--) {
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            for (int j = 1; j <= 2 * (num - i); j++) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void butterfly(int num) {
        // first half
        for (int i = 1; i < num; i++) {
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }

            // space
            for (int j = 1; j <= 2 * (num - i); j++) {
                System.out.print("* ");
            }

            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }

            System.out.println();
        }

        for (int i = num; i > 0; i--) {
            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }

            // space
            for (int j = 1; j <= 2 * (num - i); j++) {
                System.out.print("* ");
            }

            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }

            System.out.println();
        }
    }

    public static void solidrombus(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= num; j++) {
                if (j == 1 || j == num || i == 1 || i == num) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void diamondpattern(int num) {
        for (int i = 1; i <= num; i++) {
            // space
            for (int j = 1; j <= num - i; j++) {
                System.out.print("  ");
            }
            // star
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("* ");
            }
            // space
            for (int j = 1; j <= num - i; j++) {
                System.out.print("  ");
            }
            System.out.println();
        }

        for (int i = num; i >= 0; i--) {
            // space
            for (int j = 1; j <= num - i; j++) {
                System.out.print("  ");
            }
            // star
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("* ");
            }
            // space
            for (int j = 1; j <= num - i; j++) {
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    /*
     * \        1
      2 2 2
    3 3 3 3 3     
  4 4 4 4 4 4 4
5 5 5 5 5 5 5 5 5
     */

    public static void numberpiramid(int num) {
        int a = 1;
        for (int i = 1; i <= num; i++) {
            // space
            for (int j = 1; j <= num - i; j++) {
                System.out.print("  ");
            }

            // star
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print(a + " ");
            }
            // space
            for (int j = 1; j <= num - i; j++) {
                System.out.print("  ");
            }
            a++;
            System.out.println();
        }
    }

    /*    1
          2 2
         3 3 3
         4 4 4 4
        5 5 5 5 5 */

    public static void numpyramid(int num) {
        for (int i = 1; i <= num; i++) {
            // spaces
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            // num
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void palindromicpattern(int num) {
        for (int i = 1; i <= num; i++) {
            // spaces
            for (int j = 1; j <= num - i; j++) {
                System.out.print("  ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}