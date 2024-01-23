package Alpha.Data_Structure.Bitmaipulation;

public class Bits {
    public static void main(String[] args) {
        System.out.println(getIthBit(10, 3));
        System.out.println(setIthBit(10, 3));
        System.out.println(clearIthBit(10, 1));
        System.out.println(updateIthBit(10, 2, 1));
        System.out.println(clearRangeOfBit(10, 2, 4));
        // System.out.println(Math.log10(0));
        System.out.println(countSetBits(10));
    }

    public static int countSetBits(int num){
        int ct = 0;

        while (num > 0) {
            if((num&1) != 0){
                ct++;
            }
            num = num >> 1;
        }

        return ct;
    }

    public static int getIthBit(int n, int i) {
        int num = 1 << i;
        if ((n & num) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static int setIthBit(int n, int i) {
        int num = 1 << i;
        return (n | num);
    }

    public static int clearIthBit(int n, int i) {
        int num = ~(1 << i);
        return ((n & num));
    }

    public static int updateIthBit(int n, int i, int newbit) {
        n = clearIthBit(n, i);
        int bitmask = newbit << i;
        return n | bitmask;
    }

    public static int clearRangeOfBit(int num, int i, int j) {
        int a = (~0) << (j + 1);
        int b = (1 << i) - 1;

        int c = a | b;

        return (num & c);
    }

    public static boolean CheckPower(int n) {
        if (n < 0)
            return false;

        // if((n & (n-1)) == 0){
        // return true;
        // }else {
        // return false;
        // }

        double logValue = Math.log(n) / Math.log(2);
        return Math.pow(2, logValue) == n;

    }

}
