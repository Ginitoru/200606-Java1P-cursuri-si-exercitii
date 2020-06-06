import java.nio.file.Path;
import java.nio.file.Paths;

public class Exercitiu11 {
    public static void main(String[] args) {
        Path p = Paths.get("A/B/C/./../../././X/Y/Z/../../Q/W/./E");

        System.out.println(p.normalize());
    }
}
