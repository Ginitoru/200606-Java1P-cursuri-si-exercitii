import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Runnable t = () -> System.out.println("Hello world");



        executor.execute(t);
        executor.execute(t);
        executor.execute(t);
        executor.execute(t);
        executor.execute(t);


        executor.shutdown();
        executor.shutdownNow();


    }
}
