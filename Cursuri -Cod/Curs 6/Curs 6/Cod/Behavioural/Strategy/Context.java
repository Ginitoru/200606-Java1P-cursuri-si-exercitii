package Curs6.Behavioural.Strategy;

public class Context {
    private Strategy strategy;
    Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy() {
        this.strategy.doSomething();
    }
}
