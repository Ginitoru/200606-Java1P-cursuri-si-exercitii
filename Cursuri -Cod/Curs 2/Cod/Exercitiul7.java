import java.nio.file.Path;
import java.nio.file.Paths;

public class Exercitiul7 {

    public static void main(String[] args) {
        Path p = Paths.get("C:/A/B/C/D/E");

        System.out.println(p.subpath(1, 3));
    }
}
