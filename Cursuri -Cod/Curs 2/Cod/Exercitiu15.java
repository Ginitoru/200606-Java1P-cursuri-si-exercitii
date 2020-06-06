import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exercitiu15 {

    public static void main(String[] args) {


        Path sursa = Paths.get("./src/Exercitiu14.java");
        Path destinatie = Paths.get("./src/CopieExercitiu14.java");
        Path destinatie2 = Paths.get("./src/CopieExercitiu14Gresita.java");

        try {
            Files.copy(sursa, destinatie);
            Files.move(destinatie, destinatie2);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
