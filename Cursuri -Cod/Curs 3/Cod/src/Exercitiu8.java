import java.util.Arrays;
import java.util.List;

public class Exercitiu8 {

    //cele mai mici 3 numere, crescator, distincte si impare
    public static void main(String[] args) {
        List<Integer> numere =
                Arrays.asList(2, 5, 13, 5, 10, 3, 100, 5, 3);

        numere.stream()
                .filter(nr -> nr % 2 != 0)
                .distinct()
                .sorted()
                .limit(3)
                .forEach(System.out::println);

        long count = numere.stream()
                .filter(nr -> nr % 2 != 0)
                .count();

        System.out.println(numere.size() == count);

        System.out.println(
                numere.stream()
                        .noneMatch(nr -> nr % 2 == 0)
        );

    }
}
