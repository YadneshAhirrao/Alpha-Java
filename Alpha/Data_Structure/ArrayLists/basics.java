
import java.util.ArrayList;
import java.util.Collections;

public class basics {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(4);
        list.add(8);
        list.add(1);
        list.add(34);
        list.add(56);
        list.add(13);
        System.out.println(list);
        System.out.println(list.size());
        Collections.sort(list);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        


    }
}
