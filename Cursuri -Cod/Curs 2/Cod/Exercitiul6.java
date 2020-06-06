import java.nio.file.Path;
import java.nio.file.Paths;

public class Exercitiul6 {

    public static void main(String[] args) {
        Path p = Paths.get("C:/A/B/C/D/E");

        System.out.println(p.getRoot());
        for(int i = 0; i < p.getNameCount(); i++) {
            System.out.println(p.getName(i));
        }
    }
}
