public class ImplementedThread implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getId() + " is running!");
    }
}
