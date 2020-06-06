import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class TestStreamReteta {

    public static void main(String[] args) {

        //metoda 1
        Stream<Reteta> stream1 = Stream.of(new Reteta("pizza", 200),
                new Reteta("pui", 300),
                new Reteta("porc", 500));

        //metoda 2 - presupune existenta unei colectii
        List<Reteta> retete = Arrays.asList(new Reteta("pizza", 200),
                new Reteta("pui", 300),
                new Reteta("porc", 500));

        Stream<Reteta> stream2 = retete.stream();

    }
}
