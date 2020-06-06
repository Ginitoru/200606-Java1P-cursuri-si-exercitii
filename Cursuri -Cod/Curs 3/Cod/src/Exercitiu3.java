import java.util.stream.Stream;

public class Exercitiu3 {


    public static void main(String[] args) {
        Stream.iterate(1, nr -> nr + 2)
                .limit(10)
                .forEach(nr -> System.out.println(nr));
    }
}
