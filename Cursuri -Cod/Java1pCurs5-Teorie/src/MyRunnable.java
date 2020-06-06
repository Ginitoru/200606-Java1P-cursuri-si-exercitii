import java.util.concurrent.Semaphore;

public class MyRunnable implements Runnable {
    private int n;
    private Semaphore semaphore = new Semaphore(10);


    @Override
    public void run(){
        try{
            for(int i = 0; i< 50; i++){
                semaphore.acquire();
                n++;
                System.out.println(n);


            }


        }catch(InterruptedException e){
            e.printStackTrace();
        }finally {
            semaphore.release();

        }




    }

}
