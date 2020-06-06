import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercitriu7 {

    public static void main(String[] args) {
        List<Produs> produse = Produs.getList();

        Map<String, List<Produs>> result = produse.stream()
                .collect(Collectors.groupingBy(Produs::getCategorie));

        result.keySet().stream()
                .forEach(key -> afiseazaListaProduse(result, key));

    }

    public static void afiseazaListaProduse(Map<String, List<Produs>> result, String key) {
        System.out.println();
        System.out.println(key + " -> ");
        result.get(key).stream()
                .forEach(produs -> System.out.print(produs.getNume()));

    }
}
