package Practicals.TCP;
import java.util.Scanner;

public class Practical_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter IP address in binary notation (32 bits): ");
        String binaryIP = scanner.nextLine();

        if (binaryIP.length() != 32 || !binaryIP.matches("[01]+")) {
            System.out.println("Invalid input. Please enter a valid 32-bit binary IP address.");
        } else {
            String dottedDecimalIP = binaryToDottedDecimal(binaryIP);
            String hexIP = binaryToHexadecimal(binaryIP);

            System.out.println("Dotted Decimal Notation: " + dottedDecimalIP);
            System.out.println("Hexadecimal Notation: " + hexIP);
        }
        scanner.close();
    }

    public static String binaryToDottedDecimal(String binaryIP) {
        StringBuilder decimalIP = new StringBuilder();
        for (int i = 0; i < 32; i += 8) {
            int octet = Integer.parseInt(binaryIP.substring(i, i + 8), 2);
            decimalIP.append(octet);
            if (i < 24) {
                decimalIP.append(".");
            }
        }
        return decimalIP.toString();
    }

    public static String binaryToHexadecimal(String binaryIP) {
        StringBuilder hexIP = new StringBuilder();
        for (int i = 0; i < 32; i += 8) {
            int octet = Integer.parseInt(binaryIP.substring(i, i + 8), 2);
            hexIP.append(String.format("%02X", octet));
            if (i < 24) {
                hexIP.append(":");
            }
        }
        return hexIP.toString();
    }

}
