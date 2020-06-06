public class ExtendedThread extends Thread {

    private int start;
    private int stop;

    public int getSum() {
        return sum;
    }

    private int sum;

    ExtendedThread(int start, int stop) {
        this.start = start;
        this.stop = stop;
    }

    @Override
    public void run() {
        for (int i = start; i < stop; i++) {
            System.out.println(Thread.currentThread().getId() + " is running!");
            sum += i;
        }
    }
}
