package chapter1.test;

import chapter1.Guitar;
import chapter1.Inventory;
import org.junit.Test;

public class GuitarTester {
    @Test
    public void testGuitarInventory() {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        Guitar newGuitar = new Guitar("", 0, "Fender", "Stratocaster",
                "Electric");

        Guitar guitar = inventory.search(newGuitar);
        if (guitar != null) {
            System.out.println("Erin, you might like this " +
                    guitar.getBuilder() + " " + guitar.getModel() + " " +
                    guitar.getType() + " guitar:\n " +
                    guitar.getPrice() + "!");
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        inventory.addGuitar("11277", 3999.95, "Fender", "Stratocaster",
                "Electric");
        inventory.addGuitar("V95693", 1499.95, "Gibson", "Les Paul",
                "Electric");
        inventory.addGuitar("70108276", 2295.95, "Gibson", "SG",
                "Electric");
    }
}
