package observer;

public class Ex6 {
    public static void main(String[] args) {

        Chat chat = new Chat();

        User gigel = new User("gigel");
        User costel = new User("Costel");
        User maria = new User("maria");

        chat.addListener(maria);
        chat.addListener(gigel);
        chat.addListener(costel);

        chat.notifyListeners("hello dela gigel");

    }
}
