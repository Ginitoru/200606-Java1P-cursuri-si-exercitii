import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercitiu1 {


    public static void main(String[] args) {
        List<Integer> numere = Arrays.asList(-1, 3, -2, 12, 2, -3, 2, 11, 1, 4);

        List<Integer> listaNoua = new ArrayList();
        numere.stream()
                .filter(nr -> nr > 0)
                .filter(nr -> nr % 2 == 0)
                .forEach(nr -> listaNoua.add(nr));

        List<Integer> listaNoua2 = numere.stream()
                .filter(nr -> nr > 0 && nr % 2 == 0)
                .collect(Collectors.toList());
    }
}
