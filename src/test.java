import java.util.HashMap;
import java.util.Map;

public class test {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(0,"asfsd");
        map.put(1,"asfsd");
        map.put(0,"111111");

        System.out.println(map.get(0));

    }
}
