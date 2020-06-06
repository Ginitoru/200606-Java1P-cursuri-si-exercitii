public class Main {

    public static void main(String[] args) {

        //implementare interfata
        InterfataFunctionala interfataFunctionala1 =  new ImplementareInterfata();
        System.out.println(interfataFunctionala1.metoda());

        //clasa anonima
        InterfataFunctionala interfataFunctionala2 = new InterfataFunctionala() {
            @Override
            public int metoda() {
                return 20;
            }
        };
        System.out.println(interfataFunctionala2.metoda());

        //expresia lambda
        InterfataFunctionala interfataFunctionala3 = () -> 30;
        System.out.println(interfataFunctionala3.metoda());



        InterfataCuParametri interfataCuParametri = (int nr, String text) -> {
            for(int i = 0; i < nr; i++) {
                System.out.println(text);
            }
        };

        InterfataCuParametri interfataCuParametri2 = new InterfataCuParametri() {
            @Override
            public void metodaCu2Parametri(int nr, String text) {
                for(int i = 0; i < nr; i++) {
                    System.out.println(text);
                }
            }
        };



    }
}
