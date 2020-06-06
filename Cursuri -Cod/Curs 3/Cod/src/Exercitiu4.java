import java.util.Random;
import java.util.stream.Stream;

public class Exercitiu4 {


    public static void main(String[] args) {
        Random r = new Random();

        Stream.generate(() -> r.nextInt(1000))
                .limit(10)
                .forEach(nr -> System.out.println(nr));
    }

}
