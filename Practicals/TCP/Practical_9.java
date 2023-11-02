package Practicals.TCP;
import java.util.Scanner;

public class Practical_9 {

    public static void fragmentIPDatagram(int mtu, int datagramSize) {
        mtu -= 20;
        datagramSize -= 20;

        if (datagramSize <= mtu) {
            System.out.println("No fragmentation required. Datagram fits within MTU.");
            return;
        }

        int numFragments = (datagramSize + mtu - 1) / mtu;
        int remainingData = datagramSize;

        System.out.println("Fragmentation required. Creating " + numFragments + " fragments:");

        for (int fragmentNum = 1; fragmentNum <= numFragments; fragmentNum++) {
            int fragmentSize = Math.min(mtu, remainingData);
            System.out.println("Fragment " + fragmentNum + ": " + fragmentSize + " bytes");
            remainingData -= fragmentSize;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter MTU (Maximum Transmission Unit) in bytes: ");
        int mtu = scanner.nextInt();

        System.out.print("Enter datagram size in bytes: ");
        int datagramSize = scanner.nextInt();

        fragmentIPDatagram(mtu, datagramSize);
        scanner.close();
    }
}
