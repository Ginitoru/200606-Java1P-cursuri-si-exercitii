import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Exercitiu8 {

    public static void main(String[] args) {
        List<Produs> produse = Produs.getList();

        Map<String, Double> result = produse.stream()
                .collect(Collectors.groupingBy(
                        Produs::getCategorie,
                        Collectors.averagingInt(Produs::getPret)
                ));

        System.out.println(result);
    }
}
