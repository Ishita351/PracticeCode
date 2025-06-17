package chapter5;

// use of "volatile" keyword to ensure synchronization
public class DoubleCheckedSingleton {
    private volatile static DoubleCheckedSingleton uniqueInstance;

    private DoubleCheckedSingleton() {}

    public static DoubleCheckedSingleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (DoubleCheckedSingleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new DoubleCheckedSingleton();
                }
            }
        }
        return uniqueInstance;
    }
}

// best approach for synchronization