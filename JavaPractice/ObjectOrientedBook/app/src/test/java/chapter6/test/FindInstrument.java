package chapter6.test;

import java.util.*;
import chapter5.Builder;
import org.junit.Test;
import chapter6.*;

public class FindInstrument {
    @Test
    public void testInstrument(){
        Inventory inventory = new Inventory();

        Map<String, Object> properties1 = new HashMap<>();
        properties1.put("instrumentType", InstrumentType.GUITAR);
        properties1.put("builder", Builder.GIBSON);
        InstrumentSpec spec1 = new InstrumentSpec(properties1);
        inventory.addInstrument("11277", 3999.95, spec1);

        Map<String, Object> properties2 = new HashMap<>();
        properties1.put("instrumentType", InstrumentType.GUITAR);
        properties2.put("builder", Builder.FENDER);
        InstrumentSpec spec2 = new InstrumentSpec(properties2);
        inventory.addInstrument("V95693", 1499.95, spec2);

        // Search for one specific type of instrument
        Map<String, Object> searchProps = new HashMap<>();
        searchProps.put("builder", Builder.GIBSON);
        InstrumentSpec clientSpec = new InstrumentSpec(searchProps);

        // Just print matched results
        List<Instrument> matches = inventory.search(clientSpec);
        for (Instrument instrument : matches) {
            System.out.println("Matched instrument:");
            System.out.println("Serial: " + instrument.getSerialNumber());
            System.out.println("Price: Rs." + instrument.getPrice());
            System.out.println("Builder: " + instrument.getSpec().getProperty("builder"));
            System.out.println("Type: " + instrument.getSpec().getProperty("instrumentType"));
        }
    }
}

