import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableBarrierTest {
    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(4);

        Runnable task = new RunnableBarrier();

        service.execute(task);
        service.execute(task);
        service.execute(task);
        service.execute(task);

        service.shutdown();

    }

}
