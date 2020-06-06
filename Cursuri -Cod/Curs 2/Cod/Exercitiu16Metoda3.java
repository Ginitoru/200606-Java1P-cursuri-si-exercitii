import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Exercitiu16Metoda3 {

    public static void main(String[] args) {
        Path p = Paths.get("./src/Exercitiu14.java");

        try {
            Files.lines(p)
                    .filter(linie -> !linie.trim().isEmpty())
                    .filter(linie -> linie.length() % 2 == 0)
                    .map(linie -> new StringBuilder(linie).reverse().toString())
                    .filter(linie -> linie.contains("cilbup"))
                    .forEach(linie -> System.out.println(linie));

            List<String> list = Files.readAllLines(p);
            //rezolvati exercitiul de mai sus fara stream
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
