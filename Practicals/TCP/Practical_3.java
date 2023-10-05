package Practicals.TCP;
import java.util.Scanner;
public class Practical_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter IP address in hexadecimal notation (e.g., C0:A8:01:01): ");
        String hexIP = scanner.nextLine().toUpperCase();

        String dottedDecimalIP = hexToDottedDecimal(hexIP);
        String binaryIP = hexToBinary(hexIP);

        System.out.println("Dotted Decimal Notation: " + dottedDecimalIP);
        System.out.println("Binary Notation: " + binaryIP);
        scanner.close();
    }



    public static String hexToDottedDecimal(String hexIP) {
        String[] hexOctets = hexIP.split(":");
        StringBuilder decimalIP = new StringBuilder();
        
        for (String hexOctet : hexOctets) {
            int num = Integer.parseInt(hexOctet, 16);
            decimalIP.append(num);
            decimalIP.append(".");
        }
        
        return decimalIP.substring(0, decimalIP.length() - 1); // Remove the last dot
    }

    public static String hexToBinary(String hexIP) {
        String[] hexOctets = hexIP.split(":");
        StringBuilder binaryIP = new StringBuilder();
        
        for (String hexOctet : hexOctets) {
            int num = Integer.parseInt(hexOctet, 16);
            binaryIP.append(String.format("%8s", Integer.toBinaryString(num)).replace(' ', '0'));
        }
        
        return binaryIP.toString();
    }

    
}
