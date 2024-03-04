package Alpha.Revision;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        String str = "aaabbcccdd";
        // solve2(str);
        // System.out.println(solve2(str));
        // PrimeNumbers(30);
        // System.out.println(temp(str));
        // solve3(2000);
        Print(12345);

    }

    public static void Print(int num) {
        String str = Character.toString(num);
        System.out.println(str);

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int number = (int) ch;
            if (number == 0)
                continue;
            number = number * (int) Math.pow(10, str.length() - i - 1);
            System.out.print(number + " + ");
        }
    }

    public static void solve3(int num) {

        if (((num % 4 == 0) && (num % 100 != 0)) || (num % 400 == 0)) {
            System.out.println("leap");
        } else {
            System.out.println("Not Leap");
        }
    }

    public static String temp(String str) {
        int length = str.length();

        while (length > 2) {
            String compressedString = "";
            int lChar = str.charAt(0);
            int charCt = 1;

            for (int i = 1; i < length; i++) {
                if (str.charAt(i) == lChar) {
                    charCt++;
                } else {
                    compressedString += Character.toString(lChar) + Integer.toString(charCt);
                    lChar = str.charAt(i);
                    charCt = 1;
                }
            }
            compressedString += Character.toString(lChar) + Integer.toString(charCt);

            return compressedString;
        }
        return str;
    }

    public static void PrimeNumbers(int num) {
        int a = num;
        int b = num;

        while (!isPrime(a) && !isPrime(b)) {
            a++;
            b--;
        }

        if ((isPrime(a) && isPrime(b)) && a != b) {

            System.out.println(a + " " + b);
        } else if (isPrime(a)) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void solve1(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            int ct = 1;
            sb.append(str.charAt(i));

            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                ct++;
                i++;
            }

            if (ct > 1) {
                sb.append(ct);
                i++;
            }
        }

        if (sb.length() < str.length()) {
            System.out.println(sb.toString());
        } else {
            System.out.println(str);
        }
        // System.out.println(sb.getClass());
    }

    public static String solve2(String text) {
        int length = text.length();

        if (length > 2) {
            String compressedText = "";
            char lastChar = text.charAt(0);
            int charCount = 1;
            for (int i = 1; i < length; i++) {
                if (text.charAt(i) == lastChar)
                    charCount++;
                else {
                    compressedText += Character.toString(lastChar) + Integer.toString(charCount);
                    lastChar = text.charAt(i);
                    charCount = 1;
                }
            }
            // compressedText += Character.toString(lastChar) + Integer.toString(charCount);
            if (compressedText.length() < length)
                return compressedText;
        }
        return text;
    }
}
