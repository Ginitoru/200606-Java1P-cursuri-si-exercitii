import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Exercitiu16Metoda2 {

    public static void main(String[] args) {

        Path p = Paths.get("./src/Exercitiu14.java");

        try {
            if (Files.exists(p)) {
                List<String> linii = Files.readAllLines(p);

                for (String linie : linii) {
                    System.out.println(linie);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
