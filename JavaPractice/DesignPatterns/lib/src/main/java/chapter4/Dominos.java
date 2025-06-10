package chapter4;

public class Dominos extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new CheesePizza();
        } else if (item.equals("veggie")) {
            return new VegPizza();
        } else {
            throw new IllegalArgumentException("Unknown pizza type: " + item);
        }
    }
}


