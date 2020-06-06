import java.util.List;
import java.util.stream.Collectors;

public class Exercitiu6 {

    public static void main(String[] args) {
        List<Produs> produse = Produs.getList();


        String result = produse.stream()
                .map(Produs::getNume)
                .collect(Collectors.joining(", "));

        System.out.println(result);

    }
}
