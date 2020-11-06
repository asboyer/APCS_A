import java.util.ArrayList;

public class arrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        System.out.println(list);

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(5);
        System.out.println(list1);

        System.out.println(list.get(0) + list1.get(0));
        // 1 4 3 2

    }
}
