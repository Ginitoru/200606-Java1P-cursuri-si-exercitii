import java.util.*;
import java.util.stream.Collectors;

public class TestReteta {

    static List<Reteta> retete = Arrays.asList(
            new Reteta("cartofi", 500),
            new Reteta("orez", 300),
            new Reteta("carne", 399),
            new Reteta("sarmale", 450),
            new Reteta("porc", 800),
            new Reteta("pui", 530),
            new Reteta("pizza", 400)
    );

    //sa returnam numele retetelor cu calorii < 400, sortate dupa calorii
    public static void main(String[] args) {
        //p1 luam retete cu calorii < 400
        //p2 sortam, dupa calorii
        //p3 extragem numele din reteta
        List<String> numeRetete = retete.stream()
                .filter(reteta -> reteta.nrCalorii < 400)
                .sorted(Comparator.comparing(reteta -> reteta.nrCalorii))
                .map(reteta -> reteta.nume)
                .collect(Collectors.toList());

        afiseazaDetaliiRetete(retete);
        //dubleazaNumarCalorii(retete);
        dubleazaNumarCaloriiReteteLungi(retete);
        afiseazaDetaliiRetete(retete);
    }


    public static void afiseazaDetaliiRetete(List<Reteta> retete) {
        retete.stream()
                .forEach(reteta -> System.out.println(reteta));
    }

    public static void dubleazaNumarCalorii(List<Reteta> retete) {
        retete.stream()
                .forEach(reteta -> {
                    reteta.nrCalorii *= 2;
                    System.out.println(reteta);
                });
    }

    public static void dubleazaNumarCaloriiReteteLungi(List<Reteta> retete) {
        retete.stream()
                .filter(reteta -> reteta.nume.length() > 4)
                .forEach(reteta -> {
                    reteta.nrCalorii *= 2;
                });
    }

    public static boolean existaRetetaCu399Calorii(List<Reteta> retete) {
        return retete.stream()
                .anyMatch(reteta -> reteta.nrCalorii == 399);
    }


    public static void beforeJava8() {
        //p1 - luam retetele cu calorii < 400
        List<Reteta> reteteCaloriiPutine = new ArrayList<>();
        for (Reteta reteta : retete) {
            if (reteta.nrCalorii < 400)
                reteteCaloriiPutine.add(reteta);
        }

        //p2 - sortam
        Collections.sort(reteteCaloriiPutine, new Comparator<Reteta>() {
            @Override
            public int compare(Reteta reteta1, Reteta reteta2) {
                return Integer.compare(reteta1.nrCalorii, reteta2.nrCalorii);
            }
        });

        //p3 - sa luam numele din reteteCaloriiPutine
        List<String> numeRetete = new ArrayList<>();
        for (Reteta reteta : reteteCaloriiPutine) {
            numeRetete.add(reteta.nume);
        }
    }

}
