package Alpha.Data_Structure.Arrays;

public class BuyStock {
    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        //buyandsell(prices);
        buyandselldidi(prices);
        
    }

    //Approch By Shraddha Didi -> Time Complexity is O(n^2)

    public static void buyandsell(int arr[]) {
        int minbp = Integer.MAX_VALUE;
        int profit = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j <= i; j++) {
                if (arr[i] < minbp) {
                    minbp = arr[i];
                }

                profit = arr[i] - minbp;
                if(profit>max) {
                    max = profit;
                }
            }

        }

        System.out.println("The MAximum Profit is: "+max);
    }

    //Approch By Shraddha Didi -> Time Complexity is O(n)

    public static void buyandselldidi(int arr[]) {
        int BuyPrice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < arr.length; i++) {

            if (BuyPrice < arr[i]){
                int profit = arr[i] - BuyPrice;
                maxprofit = Math.max(maxprofit, profit);
            } else {
                 BuyPrice = arr[i];
            }

        }

        System.out.println("The MAximum Profit is: "+maxprofit);
    }
}
