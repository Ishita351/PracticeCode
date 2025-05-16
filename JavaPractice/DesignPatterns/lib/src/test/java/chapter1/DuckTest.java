package chapter1;

import org.testng.annotations.Test;

public class DuckTest {

    @Test
    public void testDuck() {
        Duck d1 = new Duckling();
        d1.display();
        d1.performFly();
        d1.performQuack();
    }
}
