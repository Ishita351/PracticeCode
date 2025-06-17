package chapter5;

// synchronization issue as multiple threads can enter at the same time.
// singleton makes sure only one instance of each class is created ,and it has a global point of access to it.

public class ClassicSingleton {
    private static ClassicSingleton uniqueInstance;

    private ClassicSingleton() {}

    public static ClassicSingleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ClassicSingleton();
        }
        return uniqueInstance;
    }
}
/*
Not thread-safe. If two threads call getInstance() at the same time, they might both create a new object.
In multithreaded environments, it can break the Singleton rule.
*/
