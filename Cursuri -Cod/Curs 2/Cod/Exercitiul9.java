import java.nio.file.Path;
import java.nio.file.Paths;

public class Exercitiul9 {

    public static void main(String[] args) {
        Path p1 = Paths.get("A/B/C");
        Path p2 = Paths.get("D/E/F");
        Path p3 = Paths.get("C:/G/H");
        Path p4 = Paths.get("D:/I/J");

        System.out.println(p1.resolve(p2));
        System.out.println(p3.resolve(p1));
        System.out.println(p1.resolve(p3));
        System.out.println(p3.resolve(p4));

        //"C:/A/B/C"
        //"./B/D"
        //


    }
}
