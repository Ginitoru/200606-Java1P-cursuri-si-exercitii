import java.util.List;
import java.util.concurrent.RecursiveTask;

public class SumListTask extends RecursiveTask<Integer> {

    List<Integer> list;

    public SumListTask(List<Integer> list) {
        this.list = list;
    }

    public Integer compute(){
        if(list.size() < 3){
            return list.stream().reduce(0, (a,b) -> a+b);
        }
        int mid = list.size() /2;


        SumListTask t1 = new SumListTask(list.subList(0,mid));
        SumListTask t2 = new SumListTask(list.subList(mid, list.size()));

        t1.fork();

        return t2.compute() + t1.join();

    }
}
