package chapter5;

// simplest and safest way to implement singleton

public enum SingletonEnum {
    INSTANCE;
    private int counter = 0;

    public void showMessage() {
        System.out.println("Hello from the Enum Singleton!");
    }

    public void increment() {
        counter++;
        System.out.println("Counter = " + counter);
    }

    public int getCounter() {
        return counter;
    }
}
