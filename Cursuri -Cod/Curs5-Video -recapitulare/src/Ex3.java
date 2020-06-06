import java.util.concurrent.*;

public class Ex3 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();

        Callable<Integer> c = () -> 2+4;

        Future<Integer> f = service.submit(c);
        service.shutdownNow();
        //alte operatii

        try {
            Integer v = f.get();
            System.out.println(v);
        }catch(InterruptedException | ExecutionException e){
            e.printStackTrace();
        }


    }


}
