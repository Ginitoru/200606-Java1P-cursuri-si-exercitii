import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Ex11 {


    private int x;
   ReentrantReadWriteLock s = new ReentrantReadWriteLock();


    private void increment() throws InterruptedException{
        s.writeLock().lock();
        x++;
        s.writeLock().unlock();
    }

    public void afisare() throws InterruptedException{
        s.readLock().lock();
        System.out.println(x);
        s.readLock().unlock();
    }
}
