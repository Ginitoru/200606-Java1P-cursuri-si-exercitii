import java.util.*;
import java.util.stream.Collectors;

public class Exercitiu2 {


    public static void main(String[] args) {
        List<Integer> numere = Arrays.asList(-1, 3, -2, 12, 2, -3, 2, 11, 1, 4);

        List<Integer> numereDistincte = numere.stream()
                .distinct()
                .collect(Collectors.toList());

        Set<Integer> numereDistincte2 = numere.stream()
                .collect(Collectors.toSet());

        Set<Integer> numereDistincte3 = new HashSet<>(numere);

        System.out.println(numereDistincte.getClass());
        System.out.println(numereDistincte2.getClass());


        TreeSet<Integer> lista = numere.stream()
                .distinct()
                .collect(Collectors.toCollection(TreeSet::new));
    }
}
