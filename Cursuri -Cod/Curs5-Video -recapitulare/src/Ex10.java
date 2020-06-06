import java.util.concurrent.Semaphore;

public class Ex10 {

        private int x;
        private Semaphore s = new Semaphore(1);


        private void increment() throws InterruptedException{
            s.acquire();
            x++;
            s.release();
        }

        public void afisare() throws InterruptedException{
            s.acquire();
            System.out.println(x);
            s.release();
        }

}
