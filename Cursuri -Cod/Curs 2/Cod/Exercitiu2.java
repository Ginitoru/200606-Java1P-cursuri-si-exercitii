import java.io.File;
import java.io.IOException;

public class Exercitiu2 {

    public static void main(String[] args) {
        File file = new File("./A/fisier.txt");
        try {
            boolean created = file.createNewFile();
            System.out.println(created);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
