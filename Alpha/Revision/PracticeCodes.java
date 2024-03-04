package Alpha.Revision;

public class PracticeCodes {
    public static void main(String[] args) {
        // solve1();
        // solve2();
        // solve3();
        // solve4();
        // solve5();
        // solve6();
        // solve7();
        // solve8();
        solve9();
        // solve10();
        // solve11();

        int[] arr = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 1; i <= arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void solve11() {
        int x[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int i = 0;

        for (i = 2; i < 6; ++i) {
            x[x[i]] = x[i];
        }
        for (i = 0; i < 8; ++i) {
            System.out.print(x[i]);
        }
    }

    public static void solve10() {
        int nums[] = { 2, 2, 1, 1, 1, 2, 2, 1, 2, 1 };

        int finalCount = nums.length / 2;

        for (int num : nums) {
            int count = 0;
            for (int ele : nums) {
                if (ele == num) {
                    count += 1;
                }
            }
            if (count > finalCount) {
                System.out.println(num);
            }
        }
        System.out.println(-1);
    }

    public static void solve9() {
        String str = new String("Sakkett");
        int ct = 0;
        char[] ch = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (ch[i] == ch[j]) {
                    System.out.print(ch[j]);
                    ct++;
                    break;
                }
            }
        }
    }

    public static void solve8() {
        int arr[] = { 2, 4, 5, 7, 1, 8, 9 };

        int sum = 0;
        for (int j = 0; j < arr.length - 1; j++) {
            if (arr[j] % 2 == 1) {
                sum += arr[j];
            }
        }
        System.out.println(sum);
    }

    public static void solve7() {
        int i = 0;
        int j = 2;
        do {
            i++;
            j++;
            System.out.println(4);
        } while (j < 5);
    }

    public static void solve6() {
        int a = 511709;

        int sum = 0;
        while (a != 0) {
            int x = a % 10;
            sum += x;
            a = a / 100;
        }
        System.out.println(sum);

    }

    public static void solve5() {
        int arr[] = { 5, 1, 7 };

        int sum = 0;
        for (int j = 0; j < arr.length; j += 2) {
            sum = sum + arr[j];
            j--;
        }
        System.out.println(sum);

    }

    public static void solve4() {
        int arr[] = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        if (arr.length == 0) {
            System.out.println(0);
        }

        int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }
        System.out.println(i + 1);
    }

    public static void solve3() {
        int input = 30;

        if (input % 3 == 0) {
            System.out.print("Raja ");
        } else if (input % 5 == 0) {
            System.out.print("Software ");
        }

        if (input % 3 == 0 && input % 5 == 0) {
            System.out.print("Raja Software");
        } else {
            System.out.println("Exit");
        }
    }

    public static void solve2() {
        String x = "Addresses";
        String answer = "";

        int i = 0;

        for (i = 0; i < x.length(); i++) {
            int count = 0;
            for (int j = i; j < x.length(); j++) {
                if (x.charAt(i) == x.charAt(j)) {
                    count++;
                    break;
                }

            }
            answer += x.charAt(i) + Integer.toString(count);

        }

        System.out.println(answer);
    }

    public static void solve1() {
        int max = 11;
        int count = 0;

        for (int i = 2; i <= max; i++) {
            if (i == 2) {
                count++;
                continue;
            }

            int flag = 0;
            for (int j = 2; j < i; j++) {
                if (i % j != 0) {
                    continue;
                } else {
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println();
        System.out.println(count);

    }
}
