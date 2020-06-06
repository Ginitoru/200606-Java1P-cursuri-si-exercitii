import java.util.concurrent.ForkJoinPool;

public class Ex2 {
    public static void main(String[] args) {
        ForkJoinPool fjp = new ForkJoinPool();
        fjp.invoke(new NumberRecursiveAction(1));


    }
}
