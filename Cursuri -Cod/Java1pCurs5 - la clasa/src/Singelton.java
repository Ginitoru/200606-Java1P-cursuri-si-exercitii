public class Singelton {
    private static Singelton singelton;

    private Singelton() {

    }

    public static Singelton getInstance() {

        if (singelton == null)
            synchronized (Singelton.class) {
                if (singelton == null)
                    singelton = new Singelton();
            }
        return singelton;
    }

        //advanced singleton
}


