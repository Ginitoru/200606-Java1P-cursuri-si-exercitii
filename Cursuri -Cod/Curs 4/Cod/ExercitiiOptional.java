import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ExercitiiOptional {


    public static void main(String[] args) {
        Produs p = new Produs("laptop", 100, "electronice");

        //Optional<Produs> o1 = Optional.of(null);
        Optional<Produs> o2 = Optional.ofNullable(null);

        if (o2.isPresent()) {
            Produs p2 = o2.get();
            System.out.println(p2.getNume());
        }



        Produs p2 = getProdusFromList("marcel").orElse(new Produs());
        //stiu clar ca trebuie sa ma ocup de logica pt NULL
        System.out.println(p2.getNume());

        getProdusFromList("marcel").ifPresent(produs -> System.out.println(produs.getPret()));



    }

    //returneaza un produs cu numele specificat dintr-o lista
    public static Optional<Produs> getProdusFromList(String nume) {
        List<Produs> produse = Produs.getList();
        return produse.stream()
                .filter(produs -> produs.getNume().equals(nume))
                .findFirst();
    }
}
