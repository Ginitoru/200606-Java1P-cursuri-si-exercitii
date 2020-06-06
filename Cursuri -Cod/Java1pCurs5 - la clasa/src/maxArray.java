import java.util.List;
import java.util.concurrent.Callable;

public class maxArray implements Callable<Integer> {

    List<Integer> list;

    int start, stop;

    public maxArray(List<Integer> list, int start, int stop) {
        this.list = list;
        this.start = start;
        this.stop = stop;
    }

    @Override
    public Integer call() throws Exception{
    int max = Integer.MAX_VALUE;
    for(int i = start; i < stop; i++){
        if(list.get(i) > max){
            max = list.get(i);
        }

    }
    return max;

    }
}
