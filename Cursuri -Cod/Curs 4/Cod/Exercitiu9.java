import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercitiu9 {

    public static void main(String[] args) {
        List<Integer> numere =
                Stream.generate(() -> new Random().nextInt(100))
                .limit(10)
                .collect(Collectors.toList());

        Map<Boolean, List<Integer>> result = numere.stream()
                .collect(Collectors.partitioningBy(nr -> nr % 2 == 0));
        //groupingBy -> true & false

        System.out.println(result);
    }

}
