public class Main {

    public static void main(String[] args) {
        extendedThread();
    }

    static void extendedThread() {
        ExtendedThread extendedThread1 = new ExtendedThread(1, 250);
        ExtendedThread extendedThread2 = new ExtendedThread(250, 500);
        ExtendedThread extendedThread3 = new ExtendedThread(500, 750);
        ExtendedThread extendedThread4 = new ExtendedThread(750, 1000);
        //NEW

        extendedThread1.start();
        extendedThread2.start();
        extendedThread3.start();
        extendedThread4.start();

        try {
            extendedThread1.join();
            extendedThread2.join();
            extendedThread3.join();
            extendedThread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println(extendedThread1.getSum() + extendedThread2.getSum() +
                extendedThread3.getSum() + extendedThread4.getSum());

        System.out.println("S-a terminat!");
    }

    public static void implementedThread() {
        Thread thread1 = new Thread(new ImplementedThread());
        Thread thread2 = new Thread(new ImplementedThread());
        Thread thread3 = new Thread(new ImplementedThread());
        Thread thread4 = new Thread(new ImplementedThread());

        Thread thread5 = new Thread(() -> System.out.println("Merge!"));
        Thread thread6 = new Thread(() -> printText());
        Thread thread7 = new Thread(Main::printText);

        // va fi apelata metoda run() din ImplementedThread !! de catre thread-ul curent
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }

    static void printText(){
        System.out.println("Text!");
    }
}
