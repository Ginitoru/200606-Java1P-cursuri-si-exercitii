import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteFile {

    public static void main(String[] args) {
        Path path = Paths.get("./fisier.txt");

        //Files.delete -> 2 tipuri de exceptii
        // 1 checked IOException

        try {
            Files.delete(path);
            Files.deleteIfExists(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
