package chapter4;
import org.testng.annotations.Test;

public class PizzaTest {
    @Test
    public void testPizza() {
        // Create a Pizza Store
        PizzaStore store = new PizzaStore() {
            @Override
            protected Pizza createPizza(String type) {
                return null;
            }
        };
        try{
            Pizza pizza = store.orderPizza("cheese");
            System.out.println(pizza.getName());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try {
            Pizza pizza = store.orderPizza("veggie");
            System.out.println(pizza.getName());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
