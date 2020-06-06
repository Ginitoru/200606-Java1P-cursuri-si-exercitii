import java.time.Instant;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Ex6 {

    public static void main(String[] args) {

        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();


        try{
            System.out.println(Instant.now());
            Task2 task = new Task2();
            service.schedule(task, 5, TimeUnit.SECONDS);
        }finally {
            service.shutdown();
        }






    }







}
