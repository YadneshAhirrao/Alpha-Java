import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 0) {
            solve();
        }
    }
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int ct = 0;

        if (str.charAt(1) == '+') {
            ++ct;
        } else {
            --ct;
        }
        
        System.out.println(ct);
    }
}
