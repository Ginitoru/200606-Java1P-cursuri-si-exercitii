import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ExercitiuOptional {

    static List<Reteta> retete = Arrays.asList(
            new Reteta("cartofi", 500),
            new Reteta("orez", 300),
            new Reteta("carne", 399),
            new Reteta("sarmale", 450),
            new Reteta("porc", 800),
            new Reteta("pui", 530),
            new Reteta("pizza", 400)
    );

    public static void main(String[] args) {
        Reteta reteta = getRetetaByName(retete, "pizzza");
        //daca e implementata prost, trebuie sa fac verificari suplimentare
        //System.out.println(reteta.nume);

        Optional<Reteta> optional = getRetetaByNameOptional(retete, "pizzza");
        Reteta reteta2 = optional.orElse(new Reteta());

        System.out.println(reteta2);
    }


    static Reteta getRetetaByName(List<Reteta> retete, String nume) {
        List<Reteta> reteteGasite = retete.stream()
                .filter(reteta -> reteta.nume.equals(nume))
                .collect(Collectors.toList());

        if (reteteGasite.isEmpty())
            return new Reteta();
        return reteteGasite.get(0);
    }

    static Optional<Reteta> getRetetaByNameOptional(List<Reteta> retete, String nume) {
        return retete.stream()
                .filter(reteta -> reteta.nume.equals(nume))
                .findAny();
    }

}
