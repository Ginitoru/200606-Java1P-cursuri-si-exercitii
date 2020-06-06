import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex2 {
    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(3);

        try {
            Task1 task = new Task1();
            service.execute(task);
            service.execute(task);
            service.execute(task);
            service.execute(task);
            service.execute(task);
        }finally{
            service.shutdown();
        }




    }


}
