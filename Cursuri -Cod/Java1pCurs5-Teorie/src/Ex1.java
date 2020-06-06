import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,4,5,6,3,1,2);
        List<Integer> synced = Collections.synchronizedList(list);
        synced.forEach(System.out::println);
    }
}
