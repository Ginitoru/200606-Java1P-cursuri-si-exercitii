import java.util.Arrays;
import java.util.List;

public class Ex9 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,6,5,4,7);

        list.stream()
                .parallel()
                .map(v -> doubleValue(v))
                .forEach(System.out::println);
    }

    private  static Integer doubleValue(Integer v){
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        return 2*v;
    }
}
