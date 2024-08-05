public class SearchElement {
    public static void main(String[] args) {
        int key = 33;
        int matrix[][] = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };
        SearchInMatrix1(matrix, key);
        SearchInMatrix3(matrix, key);
        // SearchInMatrix2(matrix);
    }

    // Brut Force Approch
    public static void SearchInMatrix1(int arr[][], int key) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == key) {
                    System.out.println("Element is exist on (" + (i + 1) + "," + (j + 1) + ")");
                }
            }
        }
    }

    public static void SearchInMatrix2(int arr[][]) {

    }

    public static void SearchInMatrix3(int arr[][], int key) {
        // Stair Case Approch
        int row = 0;
        int col = arr[0].length - 1;

        while (row < arr.length && col >= 0) {
            if (arr[row][col] == key) {
                System.out.println("Element is exist on (" + (row + 1) + "," + (col + 1) + ")");
                break;
            }

            else if (key < arr[row][col]) {
                col--;
            }

            else if (key > arr[row][col]) {
                row++;
            }
        }
    }
}
