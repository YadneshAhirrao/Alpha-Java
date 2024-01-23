package Practicals.TCP;

public class Practical_10 {
    public static short calculateChecksum(int[] data) {
        long sum = 0;

        // Sum 16-bit words
        for (int value : data) { 
            sum += value & 0xFFFF;
            // Handle overflow
            if (sum > 0xFFFF) {
                sum = (sum & 0xFFFF) + 1;
            }
        }

        // Take the one's complement
        return (short) (~sum & 0xFFFF);
    }

    public static void main(String[] args) {
        // Example data buffer
        int [] data = {0xc3a8, 0x0101, 0xc901, 0x0101, 0x0011, 0x000c, 0x0064, 0x0080, 0x000c, 0x0000, 0x0000, 0x0004};
        // int [] data = {0x4500, 0x0046, 0x0064, 0x0000, 0x0211, 0x0000, 0xc00a, 0x070f, 0xc40f, 0x0a0b};

        // Calculate checksum
        short checksum = calculateChecksum(data);

        // Output the result
        System.out.printf("Calculated checksum: 0x%04X%n", checksum);
    }
}
