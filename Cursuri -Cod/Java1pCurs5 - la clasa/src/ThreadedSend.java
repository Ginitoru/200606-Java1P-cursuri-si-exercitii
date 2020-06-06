public class ThreadedSend extends Thread{

     private  String message;
     private MessageSender sender;

    public ThreadedSend(String message, MessageSender sender) {

        this.message = message;
        this.sender = sender;
    }

    @Override
    public void run(){
        synchronized (sender) {
            sender.send(this.message);
            //sender e disponibil doar pentru threadul curent
        }
        //sender e disponibil pt toate threadurile
    }
}
