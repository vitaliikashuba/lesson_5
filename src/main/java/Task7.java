import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task7 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("watermelon", "berry");
        map.put("banana", "fruit");
        map.put("cherry", "berry");
        map.put("pineapple", "fruit");
        map.put("melon", "vegetable");
        map.put("cranberry", "berry");
        map.put("apple", "fruit");
        map.put("iris", "flower");
        map.put("potato", "vegetable");
        map.put("carrot", "vegetable");
        Set set = map.entrySet();
        for (Object o : set) {
            Map.Entry a = (Map.Entry) o;
            System.out.print(a.getKey() + " - ");
            System.out.println(a.getValue());
        }
    }
}
