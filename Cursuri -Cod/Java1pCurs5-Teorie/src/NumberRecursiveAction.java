import java.util.concurrent.RecursiveAction;

public class NumberRecursiveAction extends RecursiveAction {
    private int x;

    public NumberRecursiveAction(int x){
        this.x = x;
    }

    @Override
    public void compute(){
        if(x < 100){
            invokeAll(new NumberRecursiveAction(x+1), new NumberRecursiveAction(x+2));
        }else{
            System.out.println(x);
        }

    }

}
