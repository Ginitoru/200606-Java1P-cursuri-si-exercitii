package Curs6.Creational.Singleton;

public class ThreadSafeWithDubleCheckingSingleton {
    private static ThreadSafeWithDubleCheckingSingleton instance;

    private ThreadSafeWithDubleCheckingSingleton() {
    }

    public static synchronized ThreadSafeWithDubleCheckingSingleton getInstance() {
        if(instance == null){
            synchronized (ThreadSafeWithDubleCheckingSingleton.class) {
                if(instance == null){
                    instance = new ThreadSafeWithDubleCheckingSingleton();
                }
            }
        }
        return instance;
    }
}
