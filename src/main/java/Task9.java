import java.util.*;

public class Task9 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(100);
        for (int i = 0; i < 100; i++) {
            arr.add((int) (Math.random() * 100));
            System.out.print(arr.get(i) + " ");
        }
        System.out.println("\nList size: " + arr.size());
        HashSet<Integer> hashset = new HashSet<>(arr);
        System.out.print(hashset + " ");
        System.out.println("\n" + "Hashset size = " + hashset.size());
    }
}
