import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex12 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2,3,6,4,7);

        List<Integer> synclist = Collections.synchronizedList(list);


    }
}
