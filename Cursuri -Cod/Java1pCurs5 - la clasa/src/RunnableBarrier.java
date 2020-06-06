import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class RunnableBarrier implements Runnable{
    CyclicBarrier barrier = new CyclicBarrier(4);


    @Override
    public void run() {
        String threadName =Thread.currentThread().getName();
                System.out.println(threadName + " a ajuns la bariera" );


        try {
            barrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
        //portiune de caod care e executatat cand 3 threaduri ajung
        System.out.println(threadName + " a trecut de bariera" );
    }
}
