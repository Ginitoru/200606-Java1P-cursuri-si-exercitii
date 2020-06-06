package observer;

public class User implements Listener {
   private String nume;


    public User(String nume) {
        this.nume = nume;
    }

    @Override
    public void reciveMessage(String message) {
        System.out.println(nume + " a primit " + message);
    }
}
