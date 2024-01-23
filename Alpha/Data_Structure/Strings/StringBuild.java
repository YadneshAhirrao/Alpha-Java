package Alpha.Data_Structure.Strings;

import java.util.Arrays;

public class StringBuild {
    public static void main(String[] args) {
        // TC -> O(26*n)
        // String str = "Tony";
        // for (char ch = 'a'; ch <= 'z'; ch++) {
        // str += ch;
        // }

        // TC -> O(26)
        // StringBuilder sb = new StringBuilder("");
        // for (char ch = 'a'; ch <= 'z'; ch++) {
        // sb.append(ch);
        // }

        // System.out.println(sb);
        // System.out.println(str);

        // String str = "hi, yadnesh";
        // System.out.println(UpperWord(str));

        // String s = "aaabbccccdd";
        // System.out.println(StringCompress(s));

        String str1 = "Race";
        String str2 = "care";
        AnangramCheck(str1, str2);
    }

    // Convert Each Letter of the word to the upper case

    public static String UpperWord(String str) {
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length()) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }

        }
        return sb.toString();
    }

    // string Compression

    public static String StringCompress(String str) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            int ct = 1;
            sb.append(str.charAt(i));
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                ct++;
                i++;
            }
            

            if (ct > 1) {
                sb.append(ct);
            }
            i++;
        }
        return sb.toString();
    }

    // Anangram or Not

    public static void AnangramCheck(String str1, String str2) {

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if (str1.length() != str2.length()) {
            return;
        }
        char s1[] = str1.toCharArray();
        char s2[] = str2.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);

        boolean check = Arrays.equals(s1, s2);

        if (check) {
            System.out.println("Given Strings are Anangram");
        } else {
            System.out.println("They are Not Anagram");
        }

    }
}
