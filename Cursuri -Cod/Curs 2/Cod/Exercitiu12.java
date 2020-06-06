import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exercitiu12 {

    public static void main(String[] args) {
        Path p = Paths.get("Z/H/T/R/Y");

        try {
            Files.createDirectory(p);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
