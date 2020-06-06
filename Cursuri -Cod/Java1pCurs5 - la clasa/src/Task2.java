import java.time.Instant;

public class Task2 implements Runnable {

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        Instant timepStamp = Instant.now();

        System.out.println(threadName + " ->" +timepStamp);


        try{
            Thread.sleep(2000);

        }catch(InterruptedException e){
            e.printStackTrace();
        }

    }
}
