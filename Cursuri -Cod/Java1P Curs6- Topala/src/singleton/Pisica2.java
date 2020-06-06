package singleton;

public class Pisica2 {
    String nume;

    private Pisica2(){

    }

    private static final class SingeltonHolder{
        private static final Pisica2 SINGLETON = new Pisica2();
    }

    public static Pisica2 getInstance(){
        return SingeltonHolder.SINGLETON;
    }
}
