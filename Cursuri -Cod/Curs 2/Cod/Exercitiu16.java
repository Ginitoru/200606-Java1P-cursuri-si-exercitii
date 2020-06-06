import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exercitiu16 {

    public static void main(String[] args) {

        Path p = Paths.get("./src/Exercitiu14.java");
        try {
            BufferedReader bufferedReader = Files.newBufferedReader(p);
            String line = bufferedReader.readLine();

            while (line != null) {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
