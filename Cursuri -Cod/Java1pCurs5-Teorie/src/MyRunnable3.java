import java.util.concurrent.CyclicBarrier;

public class MyRunnable3 implements Runnable {
    private CyclicBarrier barrier = new CyclicBarrier(2);

    @Override
    public void run(){
        try{
            for(int i =0; i < 50; i++){
                barrier.wait();
                System.out.println(i);
            }

        }catch(InterruptedException e){
            e.printStackTrace();
        }


    }

}
