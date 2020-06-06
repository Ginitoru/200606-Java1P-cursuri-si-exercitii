import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CopieExercitiu14Gresita {

    public static void main(String[] args) {


        Path p = Paths.get("exempluFisier.txt2");
        try {
            if (Files.exists(p))
                Files.delete(p);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
