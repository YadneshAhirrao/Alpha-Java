package Practicals.TCP;

import java.util.Scanner;

public class Practical_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter IP address in dotted decimal notation : ");
        String ipAddress = scanner.nextLine();

        String[] octets = ipAddress.split("\\.");
        if (octets.length != 4) {
            System.out.println("Invalid IP address format.");
            return;
        }

        int firstOctet = Integer.parseInt(octets[0]);

        if (firstOctet > 0 && firstOctet <= 127) {
            System.out.println("IP address belongs to Class A.");
        } else if (firstOctet >= 128 && firstOctet <= 191) {
            System.out.println("IP address belongs to Class B.");
        } else if (firstOctet >= 192 && firstOctet <= 223) {
            System.out.println("IP address belongs to Class C.");
        } else if (firstOctet >= 224 && firstOctet <= 239) {
            System.out.println("IP address belongs to Class D (Multicast).");
        } else if (firstOctet >= 240 && firstOctet <= 255) {
            System.out.println("IP address belongs to Class E (Experimental).");
        } else {
            System.out.println("Invalid IP address range.");
        }

        // scanner.close();
    }
}
