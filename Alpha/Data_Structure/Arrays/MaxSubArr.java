package Alpha.Data_Structure.Arrays;

import java.util.Arrays;

public class MaxSubArr {
    public static void main(String[] args) {
        //int arr[] = { 1, -2, 6, -1, 3 };
        //int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int arr[] = {-1, -2, -3, -4};
        //PrefixSum(arr);
        //kadanes(arr);
        kadanesneg(arr);
    }

    public static void PrefixSum(int[] arr) {
        int prefix[] = new int[arr.length];
        int sum1 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum1 = sum1 + arr[i];
            prefix[i] = sum1;
        }

        System.out.println(Arrays.toString(prefix));
            int ct = 0;
            int max = Integer.MIN_VALUE;
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                int start = i;
                for (int j = i; j < arr.length; j++) {
                    int end = j;
                    sum = start==0? prefix[end] : prefix[end] - prefix[start-1] ;
                    max= Math.max(max,sum);
                    ct++;
                }
            }
            System.out.println("Total Number of Sub Array are : " + ct);
            System.out.println("MAX: " + max);
        }

        public static void kadanes(int arr[]){
            int ms = Integer.MIN_VALUE;
            int cs = 0;

            for (int i = 0; i < arr.length; i++) {
                cs += arr[i];
                if (cs < 0){
                    cs = 0;
                }
                ms = Math.max(cs, ms);
            }
            System.out.println("Maximum sum of sub array is: "+ms);
        }

        public static void kadanesneg(int arr[]){
            int ms = Integer.MIN_VALUE;
            int cs = 0;

            for (int i = 0; i < arr.length; i++) {
                cs += arr[i];
                ms = Math.max(cs, ms);
                if (cs < 0){
                    cs = 0;
                }
                
            }
            System.out.println("Maximum sum of sub array is: "+ms);
        }
    }

