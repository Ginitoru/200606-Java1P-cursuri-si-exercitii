import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exercitiul8 {

    public static void main(String[] args) {
        Path p = Paths.get("C:/A/B/C/D/E");
        File file = p.toFile();

        Path p1 = file.toPath();

    }
}
