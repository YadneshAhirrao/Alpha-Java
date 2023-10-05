package Practicals.TCP;

import java.util.*;

public class Practical_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter IP address: ");
        String ip_Address = sc.nextLine();

        String[] first_Octet = ip_Address.split("\\.");
        int firstOctet = Integer.parseInt(first_Octet[0]);
        if (firstOctet >= 0 && firstOctet <= 127) { // Class A
            System.out.println("Class A\n"+calculateClassA(ip_Address, first_Octet));
        } else if (firstOctet >= 128 && firstOctet <= 191) {// Class B
            System.out.println("Class B\n"+calculateClassB(ip_Address, first_Octet));
        } else if (firstOctet >= 192 && firstOctet <= 223) { // Class C
            System.out.println("Class C\n"+calculateClassC(ip_Address, first_Octet));
        } else {
            System.out.println("Invalid IP address.");
        }
        sc.close();
    }

    // for Class A
    private static String calculateClassA(String ipAddress, String[] octets) {
        String networkID = octets[0];
        String hostID = octets[1] + "." + octets[2] + "." + octets[3];
        String networkAddress = "0.0.0";
        return "Network ID: " + networkID + "." + networkAddress + "\nHost ID: " + hostID + "\nNetwork Address: "
                + networkID + "." + networkAddress;
    }

    // for Class B
    private static String calculateClassB(String ipAddress, String[] octets) {
        String networkID = octets[0] + "." + octets[1];
        String hostID = octets[2] + "." + octets[3];
        String networkAddress = "0.0";
        return "Network ID: " + networkID + "." + networkAddress + "\nHost ID: " + hostID + "\nNetwork Address: "
                + networkID + "." + networkAddress;
    }

    // for Class C
    private static String calculateClassC(String ipAddress, String[] octets) {
        String networkID = octets[0] + "." + octets[1] + "." + octets[2];
        String hostID = octets[3];
        String networkAddress = "0";
        return "Network ID: " + networkID + "." + networkAddress + "\nHost ID: " + hostID + "\nNetwork Address: "
                + networkID + "." + networkAddress;

    }
}