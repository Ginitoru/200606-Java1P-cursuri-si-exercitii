import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Exercitiu3 {


    public static void main(String[] args) {
        List<Integer> numere = Arrays.asList(-1, 3, -2, 12, 2, -3, 2, 11, 1, 4);

        LinkedHashSet<Integer> numerePozitive = numere.stream()
                .filter(nr -> nr > 0)
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }
}
