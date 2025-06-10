package chapter4;

//type 1 of pizza
public class CheesePizza extends Pizza {
    public CheesePizza() {
        name = "Generic Cheese Pizza";
        dough = "Regular Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Shredded Mozzarella Cheese");
    }
    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}