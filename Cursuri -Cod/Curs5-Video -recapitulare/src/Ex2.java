public class Ex2 {
    public static void main(String[] args) {

//        ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
//
//
//        Runnable r1 = () -> System.out.println("hello");
//        service.execute(r1);
//
//
//      int x = Thread.activeCount();
//       System.out.println(x);
     String  y = Thread.currentThread().getName();
      System.out.println(y);


        Thread  t1= Thread.currentThread();
        System.out.println(t1);

//
//        service.shutdownNow();
//       boolean o = service.isShutdown();
//        boolean  p = service.isTerminated();
//        System.out.println(o + " " + p);


    }

}
