package chapter1;

import java.util.*;

public class Inventory {
    private List<Guitar> guitars;

    public Inventory() {
        guitars = new LinkedList<>();
    }

    public void addGuitar(String serialNumber, double price,
                          String builder, String model,
                          String type) {
        Guitar guitar = new Guitar(serialNumber, price, builder,
                model, type);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber) {
        for (Guitar guitar : guitars) {
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    public Guitar search(Guitar searchGuitar) {
        for (Guitar guitar : guitars) {
            String builder = searchGuitar.getBuilder();
            if ((builder != null) && (!builder.equals("")) &&
                    (!builder.equalsIgnoreCase(guitar.getBuilder())))
                continue;

            String model = searchGuitar.getModel();
            if ((model != null) && (!model.equals("")) &&
                    (!model.equalsIgnoreCase(guitar.getModel())))
                continue;

            String type = searchGuitar.getType();
            if ((type != null) && (!type.equals("")) &&
                    (!type.equalsIgnoreCase(guitar.getType())))
                continue;

            return guitar;
        }
        return null;
    }
}

