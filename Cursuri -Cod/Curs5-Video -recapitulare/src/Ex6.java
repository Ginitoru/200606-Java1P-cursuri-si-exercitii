import java.util.concurrent.ForkJoinPool;

public class Ex6 {
    public static void main(String[] args) {

        ForkJoinPool pool = new ForkJoinPool();

        FiboTask task = new FiboTask(8);

       Integer rez = pool.invoke(task);
        System.out.println(rez);



    }
}
