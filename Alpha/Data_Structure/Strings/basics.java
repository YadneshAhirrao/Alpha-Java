package Alpha.Data_Structure.Strings;

public class basics {
    public static void main(String[] args) {
        String str = new String("Hello");
        //String str2 = "Yadnesh";
        String str3 = "racecar";
        String str4 = "WNEENESENNN";
        String[] Fruits = { "Apple", "Mango", "banana" };
        String title = "i.like.this.program.very.much";
        System.out.println(title.replace(str4, title));
        // System.out.println(str + " " + str2);
        // System.out.println(str2.length());
        PrintLetters(str);
        
        System.out.println(CheckPalindrome(str3));
        System.out.println(ShortestPath(str4));
        System.out.println(LargeString(Fruits));
    }

    
    public static void PrintLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static boolean CheckPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }

    public static double ShortestPath(String str) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'W') {
                x--;
            } else if (str.charAt(i) == 'N') {
                y++;
            } else if (str.charAt(i) == 'E') {
                x++;
            } else if (str.charAt(i) == 'S') {
                y--;
            }
        }

        double ans = Math.sqrt((Math.pow((0 - x), 2)) + (Math.pow((0 - y), 2)));

        return ans;
    }

    public static String LargeString(String[] fruits) {
        String largest = fruits[0];

        for (int i = 0; i < fruits.length; i++) {
            if (largest.compareToIgnoreCase(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }

        return largest;
    }
}
