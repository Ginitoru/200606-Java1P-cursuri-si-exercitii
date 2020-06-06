import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializarePisica {

    public static void main(String[] args) {

        try (FileInputStream fileInputStream = new FileInputStream("pisici.txt");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {

            Pisica p = (Pisica) objectInputStream.readObject();
            System.out.println(p.culoare);
            System.out.println(p.varsta);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
