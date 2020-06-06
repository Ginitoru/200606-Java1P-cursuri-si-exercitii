import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Ex4 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();

        Runnable r = () -> System.out.println("cacat");

        Future<?> f = service.submit(r);



        try{
            f.get();

        }catch(InterruptedException | ExecutionException e){
            e.printStackTrace();
        }finally {
            service.shutdown();
        }

    }
}
