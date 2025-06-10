package chapter4;
import java.util.ArrayList;
import java.util.List;

//making a pizza and adding its functionalities
public abstract class Pizza {
    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough: " + dough);
        System.out.println("Adding sauce: " + sauce);
        System.out.println("Adding toppings:");
        for (String topping : toppings) {
            System.out.println("   " + topping);
        }
    }

    public void bake() {
        System.out.println("Bake for 25 minutes");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in box");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        // For displaying pizza details
        StringBuilder display = new StringBuilder();
        display.append("---- ").append(name).append(" ----\n");
        display.append(dough).append("\n");
        display.append(sauce).append("\n");
        for (String topping : toppings) {
            display.append(topping).append("\n");
        }
        return display.toString();
    }
}
