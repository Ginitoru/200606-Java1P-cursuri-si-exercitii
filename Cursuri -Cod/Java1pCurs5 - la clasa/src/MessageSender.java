public class MessageSender {

        public void send(String message){
            synchronized (this){
                System.out.println("Sending" + message);

                try{
                    Thread.sleep(2000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }

                System.out.println(message + " sent!");
            }
        }
}
