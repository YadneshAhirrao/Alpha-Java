package Alpha.Data_Structure.Arrays;

public class Study {
    public static void main(String[] args) {
        String menu[] = { "Dosa", "Idli", "Samosa", "Pizza" };
        String item = "Dosa";
        isFoodPresent(menu, item);
    }

    public static void isFoodPresent(String arr[], String str) {
        boolean ct = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == str) {
                ct = true;
            }
        }
        if (ct) {
            System.out.println(str + " is present in menu");

        } else {
            System.out.println("Your Selected item is not Present in Menu List");
        }
    }

}
