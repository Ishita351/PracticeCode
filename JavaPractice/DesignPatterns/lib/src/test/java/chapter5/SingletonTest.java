package chapter5;

import org.testng.annotations.Test;

public class SingletonTest {
    @Test
    public void testSingleton() {
        ClassicSingleton s1 = ClassicSingleton.getInstance();
        System.out.println(s1);
        ThreadSafeSingleton s2 = ThreadSafeSingleton.getInstance();
        System.out.println(s2);
        DoubleCheckedSingleton s3 = DoubleCheckedSingleton.getInstance();
        System.out.println(s3);
        DoubleCheckedSingleton s4 = DoubleCheckedSingleton.getInstance(); //same instance only
        System.out.println(s4);
    }

}
