import java.util.Arrays;
import java.util.List;

public class Exercitiu9 {
    static List<String> stringuri =
            Arrays.asList("abc", "aaaa", "bva",
                    "qweqweqwe", "bkw", "a",
                    "abbaba", "412");

    public static void main(String[] args) {
        long nr = stringuri.stream()
                .filter(string -> string.length() == 3)
                .count();
        System.out.println(nr);
    }
}
