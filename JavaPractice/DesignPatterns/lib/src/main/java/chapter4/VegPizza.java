package chapter4;

//type 2 of pizza
public class VegPizza extends Pizza {
    public VegPizza() {
        name = "Generic Veggie Pizza";
        dough = "Thin Crust Dough";
        sauce = "Tomato Sauce";
        toppings.add("Mushrooms");
        toppings.add("Onions");
        toppings.add("Green Peppers");
        toppings.add("Olives");
    }
}