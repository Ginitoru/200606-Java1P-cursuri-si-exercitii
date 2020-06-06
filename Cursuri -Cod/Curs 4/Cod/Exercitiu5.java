import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercitiu5 {


    public static void main(String[] args) {
        List<String> stringuri = Arrays.asList("aaa", "a", "abcdef", "bbb", "abcd");
        //3, 1, 6, 3, 4

        //aaa, a, abcdef, bbb, abcd
        String result = stringuri.stream()
                .map(String::length) // 3 1 6 3 4
                .map(Object::toString) // "3" "1" "6" "3" "4"
                .collect(Collectors.joining(" | "));

        System.out.println(result);
    }
}
