import java.io.File;

public class Exercitiu3 {

    public static void main(String[] args) {
        File file = new File("./A");

        String[] list = file.list();
        System.out.println(list);

        boolean deleted = file.delete();
        System.out.println(deleted);
    }
}
