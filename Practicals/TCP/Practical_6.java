package Practicals.TCP;

import java.util.Scanner;

public class Practical_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter IP address:- ");
        String ipAddress = sc.nextLine();
        System.out.println("Enter the number of subnets: " );
        int numberOfSubnets = sc.nextInt();
        // Calculate subnets
        calculateSubnets(ipAddress, numberOfSubnets);
        sc.close();
    }

    public static void calculateSubnets(String ipAddress, int numberOfSubnets) {
        String[] ipParts = ipAddress.split("\\.");

        // Determine the subnet mask based on the number of subnets
        int subnetBits = (int) Math.ceil(Math.log(numberOfSubnets) / Math.log(2));
        int subnetMask = 32 - subnetBits;
        int numberOfAddresses = (int) Math.pow(2, subnetBits);
        int stepSize = 256 / numberOfAddresses;

        // Calculate subnets
        int[] networkAddress = new int[4];
        int[] broadcastAddress = new int[4];
        for (int i = 0; i < numberOfAddresses; i++) {
            for (int j = 0; j < 4; j++) {
                networkAddress[j] = Integer.parseInt(ipParts[j]);
                broadcastAddress[j] = networkAddress[j];
            }

            networkAddress[3] = i * stepSize;
            broadcastAddress[3] = (i + 1) * stepSize - 1;
            System.out.println();
            System.out.println("Subnet " + (i + 1));
            System.out.println("Network Address: " + joinParts(networkAddress));
            System.out.println("Broadcast Address: " + joinParts(broadcastAddress));
            // System.out.println("Number of Host Addresses: " + (numberOfAddresses - 2));
            System.out.println("--------------------");
        }

    }

    public static String joinParts(int[] parts) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < parts.length; i++) {
            result.append(parts[i]);
            if (i < parts.length - 1) {
                result.append(".");
            }
        }

        return result.toString();

    }
}

    

