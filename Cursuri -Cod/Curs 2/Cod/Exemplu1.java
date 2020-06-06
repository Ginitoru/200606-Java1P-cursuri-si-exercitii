import java.nio.file.*;

public class Exemplu1 {

    public static void main(String[] args) {
        Path p = Paths.get("A/B/C");

        System.out.println(p.getClass());
    }
}
