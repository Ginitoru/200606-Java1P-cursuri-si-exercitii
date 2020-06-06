import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializarePisica {

    public static void main(String[] args) {

        try(FileOutputStream fileOutputStream = new FileOutputStream("pisici.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {

            Pisica pisica = new Pisica(2, "gri");
            objectOutputStream.writeObject(pisica);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
