public class Task1 implements Runnable {



  @Override
  public void run(){
      String threadName = Thread.currentThread().getName();
      System.out.println("Staring task.....");
      System.out.println("Thread" + threadName);

      try {
          Thread.sleep(2000);
      }catch(InterruptedException e){
          e.printStackTrace();
      }

      System.out.println("Ending task");
  }

}
