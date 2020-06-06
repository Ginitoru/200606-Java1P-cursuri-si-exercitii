import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParallelStreamEx {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,6,5,4,7,8,9,5,4,6,4,7);

      List<Integer> rezultat =  list.parallelStream()
                .filter(nr -> nr %2 ==0)
                .filter(nr -> nr % 2 ==0)
                .collect(Collectors.toList());
        Stream.iterate(0, i -> i+1)
                .limit(100000)
                .collect(Collectors.toList());

        //2 moment in car enu


    }


}
