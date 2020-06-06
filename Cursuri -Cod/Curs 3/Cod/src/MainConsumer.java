import java.util.function.Consumer;
import java.util.function.Predicate;

public class MainConsumer {

    public static void main(String[] args) {

        Consumer consumator = new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println(o);
            }
        };

        Consumer consumator2 = System.out::println;


        //Predicate - primeste un obiect, returneaza boolean
        Predicate predicat = x -> {
            if (x instanceof Number) {
                int n = (int) x;
                return n % 2 == 0;
            }
            return false;
        };


    }
}
