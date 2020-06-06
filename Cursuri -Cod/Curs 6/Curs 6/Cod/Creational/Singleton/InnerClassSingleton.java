package Curs6.Creational.Singleton;

public class InnerClassSingleton {
    private InnerClassSingleton() {
    }

    private static class SingletonHelper {
        private static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
    }

    public static InnerClassSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
