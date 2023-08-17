package Practicals.TCP;

import java.util.Scanner;

public class Practical_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter IP address in dotted decimal notation (e.g., 192.168.1.1): ");
        String decimalIP = scanner.nextLine();

        String binaryIP = decimalToBinary(decimalIP);
        String hexIP = decimalToHexadecimal(decimalIP);

        System.out.println("Binary Notation: " + binaryIP);
        System.out.println("Hexadecimal Notation: " + hexIP);
        scanner.close();
    }

    public static String decimalToHexadecimal(String decimalIP) {
        String[] octets = decimalIP.split("\\.");
        StringBuilder hexIP = new StringBuilder();

        for (String octet : octets) {
            int num = Integer.parseInt(octet);
            hexIP.append(String.format("%02X", num));
            hexIP.append(":");
        }

        return hexIP.substring(0, hexIP.length() - 1); // Remove the last colon
    }

    public static String decimalToBinary(String decimalIP) {
        String[] octets = decimalIP.split("\\.");
        StringBuilder binaryIP = new StringBuilder();

        for (String octet : octets) {
            int num = Integer.parseInt(octet);
            binaryIP.append(String.format("%8s", Integer.toBinaryString(num)).replace(' ', '0'));
        }

        return binaryIP.toString();
    }
}
