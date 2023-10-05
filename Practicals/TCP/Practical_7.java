package Practicals.TCP;

// Name: Yadnesh Rakesh Ahirrao ( 2020BCS156 )
import java.util.Scanner;

public class Practical_7 {
    public static void main(String[] args) {
        String ipAddress = "192.168.1.0/24";
        String[] parts = ipAddress.split("/");
        String baseAddress = parts[0];
        int prefixLength = Integer.parseInt(parts[1]);

        String[] ipParts = baseAddress.split("\\.");
        int[] ipIntArray = new int[4];
        for (int i = 0; i < 4; i++) {
            ipIntArray[i] = Integer.parseInt(ipParts[i]);
        }
        int hostBits = 32 - prefixLength;
        // Calculate end address
        int endAddress = 0;
        for (int i = 0; i < hostBits; i++) {
            endAddress |= (1 << i);
        }
        ipIntArray[3] += endAddress;

        String endAddressString = String.format("%d.%d.%d.%d", ipIntArray[0], ipIntArray[1], ipIntArray[2],
                ipIntArray[3]);

        System.out.println("Start Address: " + baseAddress);
        System.out.println("End Address: " + endAddressString);
    }
}
