import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Ex5 {
    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(4);

        List<Integer> lista = Arrays.asList(3,5,6,4,5,7,4,-1,2,11,5,6);

        maxArray task1 = new maxArray(lista,0, 0);
        maxArray task2 = new maxArray(lista,3, 6);
        maxArray task3 = new maxArray(lista,6, 9);
        maxArray task4 = new maxArray(lista, 9, 12);

        Future<Integer> future1 = service.submit(task1);
        Future<Integer> future2 = service.submit(task2);
        Future<Integer> future3 = service.submit(task3);
        Future<Integer> future4 = service.submit(task4);

        try{
            int max1 = future1.get();
            int max2 = future2.get();
            int max3 = future3.get();


        }catch(InterruptedException | ExecutionException e){
            e.printStackTrace();

        }finally{


        }

    }
}
