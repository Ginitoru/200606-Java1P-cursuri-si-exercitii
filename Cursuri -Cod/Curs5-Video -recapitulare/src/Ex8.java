import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class Ex8 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2,5,6,4,8,7,9,8,5,2,3);

        ForkJoinPool pool = new ForkJoinPool();
        SquareAction a = new SquareAction(list);

        pool.invoke(a);



    }

}
