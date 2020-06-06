package Curs6.Behavioural.Strategy;

public class TestStrategy {

    public static void main(String[] args) {
        Strategy strategy1 = new Strategy1();
        Context context1 = new Context(strategy1);
        context1.executeStrategy();

        Strategy strategy2 = new Strategy2();
        Context context2 = new Context(strategy2);
        context2.executeStrategy();
    }
}
