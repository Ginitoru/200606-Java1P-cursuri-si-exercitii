package Curs6.Creational.Singleton;

public class ThreadSafeWithLockOnGetterSingleton {
    private static ThreadSafeWithLockOnGetterSingleton instance;

    private ThreadSafeWithLockOnGetterSingleton() {
    }

    public static synchronized ThreadSafeWithLockOnGetterSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeWithLockOnGetterSingleton();
        }
        return instance;
    }
}
