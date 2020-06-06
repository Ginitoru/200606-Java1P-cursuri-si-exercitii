public class MessageSenderTest {
    public static void main(String[] args) {
        MessageSender sender = new MessageSender();
        ThreadedSend t1 = new ThreadedSend("hi", sender);
        ThreadedSend t2 = new ThreadedSend("bye", sender);

        t1.start();
        t2.start();
    }

}
