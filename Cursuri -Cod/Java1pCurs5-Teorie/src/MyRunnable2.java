import java.util.Random;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class MyRunnable2 implements Runnable{
    private Random r = new Random();
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    private int x;
    private int sum;

    @Override
    public void run(){
        for(int i = 0; i < 50; i++){
            changeX();
            read();


        }

    }



    public void changeX(){
        try {
            lock.writeLock().lock();
            x = r.nextInt();

        }finally{
            lock.writeLock().unlock();
        }
    }

    public void read(){

        try{
            lock.readLock().lock();
            sum = +x;


        }finally {
            lock.readLock().unlock();
        }
    }

}
