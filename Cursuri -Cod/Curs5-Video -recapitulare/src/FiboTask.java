import java.util.concurrent.RecursiveTask;

public class FiboTask extends RecursiveTask<Integer> {
    private Integer n;

    public FiboTask(Integer n) {
        this.n = n;
    }

    @Override
    public Integer compute() {
        if(n <= 1){
            return n;
        }

        FiboTask f1 = new FiboTask(n-1);
        FiboTask f2 = new FiboTask(n-2);

        f2.fork();

        return f1.compute() + f2.join();
    }
}
