package Practicals.TCP;
import java.util.Scanner;

public class Practical_8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an IPv4 address in CIDR notation (e.g., 195.160.0.0/26): ");
        String ipStr = scanner.nextLine();

        String[] parts = ipStr.split("/");
        if (parts.length != 2) {
            System.out.println("Invalid CIDR notation format.");
            return;
        }

        String ipAddress = parts[0];
        int subnetBits = Integer.parseInt(parts[1]);

        String[] ipParts = ipAddress.split("\\.");
        if (ipParts.length != 4) {
            System.out.println("Invalid IP address format.");
            return;
        }

        int a = Integer.parseInt(ipParts[0]);
        int b = Integer.parseInt(ipParts[1]);
        int c = Integer.parseInt(ipParts[2]);
        int d = Integer.parseInt(ipParts[3]);

        if (a < 0 || a > 255 || b < 0 || b > 255 || c < 0 || c > 255 || d < 0 || d > 255) {
            System.out.println("Invalid IP address.");
            return;
        }

        long ip = ((long) a << 24) | ((long) b << 16) | ((long) c << 8) | d;
        long subnetMask = 0xFFFFFFFFL << (32 - subnetBits);

        System.out.print("Enter the number of subnets: ");
        int numSubnets = scanner.nextInt();

        if (numSubnets <= 0 || numSubnets > (1 << subnetBits)) {
            System.out.println("Invalid number of subnets.");
            return;
        }

        System.out.println("Number of Subnets: " + numSubnets);
        long subnetStart = ip & subnetMask;
        long subnetSize = (1L << (32 - subnetBits)) / numSubnets;

        System.out.println("Subnet ranges:");
        for (int i = 0; i < numSubnets; i++) {
            long subnetEnd = subnetStart + subnetSize - 1;
            System.out.printf("%d.%d.%d.%d - %d.%d.%d.%d%n",
                    (subnetStart >> 24) & 255, (subnetStart >> 16) & 255,
                    (subnetStart >> 8) & 255, (subnetStart & 255),
                    (subnetEnd >> 24) & 255, (subnetEnd >> 16) & 255,
                    (subnetEnd >> 8) & 255, (subnetEnd & 255));
            subnetStart = subnetEnd + 1;
        }

        scanner.close();
    }
}
