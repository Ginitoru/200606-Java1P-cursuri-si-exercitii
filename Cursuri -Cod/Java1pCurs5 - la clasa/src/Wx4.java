import java.util.concurrent.*;

public class Wx4 {

    public static void main(String[] args) {

        ExecutorService service = Executors.newSingleThreadExecutor();
        String url = "https://profs.info.uaic.ro/~acf/java/Cristian_Frasinaru-Curs_practic_de_Java.pdf";
        Callable<String> task = new DownloadTask(url);

        Future<String> future = service.submit(task);

        System.out.println(future.isDone());
        future.isCancelled();
        try{
            future.get();
        }catch(InterruptedException | ExecutionException e){
            e.printStackTrace();
        }finally{
            service.shutdown();
        }


       // service.submit(task);


    }
}
