package singleton;

public class Pisica {
 String nume;
 private static Pisica SINGLETON;

 private Pisica(){}

 public static synchronized Pisica getInstance(){

             if(SINGLETON == null) {
                 SINGLETON = new Pisica();
         }
     return SINGLETON;
 }
}
