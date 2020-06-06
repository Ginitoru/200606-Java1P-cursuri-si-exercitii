import java.io.File;

public class Exercitiu1 {

    public static void main(String[] args) {
        File file = new File("./A");
        boolean created = file.mkdir();

        System.out.println(created);
    }
}
