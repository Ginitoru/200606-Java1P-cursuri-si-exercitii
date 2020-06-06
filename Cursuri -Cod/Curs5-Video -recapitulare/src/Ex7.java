import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class Ex7 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2,6,5,4,7,8,9,5,4,5,7,8,9,5,4);

        ForkJoinPool pool = new ForkJoinPool();
        SumListTask task = new SumListTask(list);

        Integer rez =pool.invoke(task);
        System.out.println(rez);

    }
}
