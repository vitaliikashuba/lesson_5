import java.util.ArrayList;

public class Task5 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        int size = arr.size();
        arr.add("String 1 ");
        arr.add("String 2 ");
        arr.add("String 3 ");
        arr.add("String 4 ");
        arr.add("String 5 ");
        size = arr.size();
        System.out.println("size of array list: " + size);
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i));
        }
    }
}
