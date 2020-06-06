import java.util.concurrent.atomic.AtomicInteger;

public class MyRunnable4 implements Runnable {
    private AtomicInteger x = new AtomicInteger(0);

    @Override
    public void run (){
        for(int i = 0; i< 50; i++){
            System.out.println(x.incrementAndGet());

        }


    }
}
