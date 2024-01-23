package Alpha.Data_Structure.Arrays.TD_Arrays;

public class SpiralMatrix {
    public static void main(String[] args) {
        int arr[][] = {
                        {1, 2, 3 ,4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16}
        };
        PrintSpiral(arr);
    }


    public static void PrintSpiral(int arr[][]){
        int sr = 0;
        int sc = 0;
        int er = arr.length - 1;
        int ec = arr[0].length - 1;

        while (sr <=er && sc <= ec ) {
            //top
            for (int i = sc; i <= ec ; i++) {
                System.out.print(arr[sr][i]+" ");
            }
            sr++;

            //right
            for (int i = sr; i <= er ; i++) {
                System.out.print(arr[i][ec]+" ");
            }
            ec--;

            //bottom
            
            for (int i = ec; i >= sc && sr<=er; i--) {
                System.out.print(arr[er][i]+" ");
            }
            er--;

            //left

            for (int i = er; i >= sr && sc<=ec; i--) {
                System.out.print(arr[i][sc]+" ");
            }
            sc++;
        }
    }
}
