import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exercitiu22 {

    public static void main(String[] args) {
        Path p = Paths.get("./src/");

        try {
            Files.list(p)
                   .forEach(fisier -> System.out.println(fisier));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
