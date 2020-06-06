import java.nio.file.Path;
import java.nio.file.Paths;

public class Exercitiu10 {


    public static void main(String[] args) {
        Path p1 = Paths.get("A/B/C/D");
        Path p2 = Paths.get("C:/X/Y");

        System.out.println(p2.relativize(p1));

    }
}
