
import java.util.*;

public class linearSearch {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        // ** Declearation of arr **

        // int a[] = new int[10];
        // int b[]= {1,2,7,4,9,12};


        int arr[] = {2,4,5,6,7,8,10};
        // int key = 8;

        // ** By creating our Function **


        // int index = linearFinder(arr, key);
        // if (index==-1) {
        //     System.out.println("Element is not present in array");
        // }
        // else{
        //     System.out.println("Element is present at "+(index+1)+" Position");
        // }

        //Printing Array using Inbuild Function Present in java.util.Arrays;    

        // System.out.println(Arrays.toString(arr));

        // ** Home Work of string arr by sharaddha didi **

           // LinerarString();

        //System.out.println(LargestElement(arr));
        LargSmall(arr);
    }

    public static int linearFinder(int arr[], int target){
        for (int i = 0; i < arr.length; i++) {
            if(target==arr[i]){
                return i;
            }
        }
        return -1;
    }

    public static void LinerarString(){
        Scanner sc = new Scanner(System.in);
        String arr[] = {"Dosa", "Idli","Samosa","Vadapav","Pizza","Manchuriyan"};
        System.out.println("What Food Do You Want To Eat ???");
        String str = sc.next();
        isFoodPresent(arr, str);
        sc.close();
    }

    public static void isFoodPresent(String arr[], String str){
        boolean ct = false;
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(str)) {
                ct = true;
            }
        }
        if (ct==true) {
            System.out.println(str+" is present in menu");

        } else {
            System.out.println("Your Selected item is not Present in Menu List");
        }
    }

    public static int LargestElement(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void LargSmall(int arr[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min ) {
                min = arr[i];
            }
        }

        System.out.println("The Largest NUmber of Array is "+max);
        System.out.println("The Smallest Number of Array is "+min);
    }
}
