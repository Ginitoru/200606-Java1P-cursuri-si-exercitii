import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex1 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();



        try {
            while (true) {
                Thread.sleep(300);
                service.execute(() -> adunare(3, 5));
                service.execute(() -> System.out.println("bau" ));

                String h =Thread.currentThread().getName();
                System.out.println(h);
            }
            }catch(InterruptedException e){
            e.printStackTrace();
            }finally {
            service.shutdown();
        }


    }

    private static int adunare(int a, int b){
        return a+b;

    }


}
