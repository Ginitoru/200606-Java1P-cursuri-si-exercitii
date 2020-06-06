import java.time.Instant;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Ex7 {

    public static void main(String[] args) {


        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();



            System.out.println(Instant.now());
            Task2 task = new Task2();
           // service.scheduleWithFixedDelay(task,0,3,TimeUnit.SECONDS);
            service.scheduleAtFixedRate(task,0,3, TimeUnit.SECONDS);
    }
}
