import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercitiu4 {

    public static void main(String[] args) {
        List<Produs> produse = Produs.getList();

        Map<String, Integer> mapProduse1 = new HashMap<>();
        produse.stream()
                .forEach(produs ->
                        mapProduse1.put(produs.getNume(), produs.getPret()));


        Map<String, Integer> mapProduse2 = produse.stream()
                .collect(Collectors.toMap(Produs::getNume, Produs::getPret,
                        (oldValue, newValue) -> oldValue + newValue));

        System.out.println(mapProduse2);
    }
}
