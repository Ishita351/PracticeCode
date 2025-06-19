package chapter5.test;
import chapter5.*;
import org.junit.Test;

import java.util.*;

public class FindInstrumentTester {
    @Test
    public void testInstrument() {
        Inventory inventory = new Inventory();

        inventory.addInstrument("112", 3999,
                new GuitarSpec(Builder.COLLINGS, "CJ", Type.ACOUSTIC, 6));

        GuitarSpec gSpec = new GuitarSpec(Builder.COLLINGS, "CJ", Type.ACOUSTIC, 6);

        List<Guitar> matchingGuitars = inventory.search(gSpec);
        for (Guitar guitar : matchingGuitars) {
            GuitarSpec spec = (GuitarSpec) guitar.getSpec();
            System.out.println( spec.getBuilder() + " " + spec.getModel() + " " + guitar.getPrice());
        }
    }
}

