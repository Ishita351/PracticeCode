package chapter5;

import org.testng.annotations.Test;

public class EnumTest {
    @Test
    public void testEnum() {
        SingletonEnum s1 = SingletonEnum.INSTANCE;
        SingletonEnum s2 = SingletonEnum.INSTANCE;

        s1.showMessage();
        s1.increment();         // Counter = 1
        s2.increment();         // Counter = 2

        // Verify both are the same instance
        System.out.println("Are both instances same? " + (s1 == s2)); // true
        System.out.println("Final Counter: " + s1.getCounter()); // 2
    }
}


