import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex3 {
    public static void main(String[] args) {

        ExecutorService service = Executors.newCachedThreadPool();

        try {
            Task1 task = new Task1();
            service.execute(task);
            service.execute(task);
            service.execute(task);
            service.execute(task);
            service.execute(task);
            Thread.sleep(5000);
            service.execute(task);
            Thread.sleep(65000);
            service.execute(task);

            //service.invokeAll();

        }catch(InterruptedException e){
            e.printStackTrace();
        }

        finally {
            service.shutdown();

        }
    }
}
