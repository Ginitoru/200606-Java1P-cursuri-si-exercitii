import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Ex5 {
    public static void main(String[] args) {
        ScheduledExecutorService service  = Executors.newSingleThreadScheduledExecutor();
        Runnable r = () -> System.out.println("hello" + LocalTime.now());

       // service.schedule(r,5, TimeUnit.SECONDS);
      //  service.scheduleAtFixedRate(r, 2, 3, TimeUnit.SECONDS);
        service.scheduleWithFixedDelay(r,2,3, TimeUnit.SECONDS);
        try{
            Thread.sleep(10000);
        }catch(InterruptedException e){

        }finally {
            service.shutdown();
        }







    }
}
