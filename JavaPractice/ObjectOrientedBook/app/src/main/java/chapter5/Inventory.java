package chapter5;

import java.util.*;

public class Inventory {
    private List<Instrument> inventory;

    public Inventory() {
        inventory = new LinkedList<>();
    }

    public void addInstrument(String serialNumber, double price, InstrumentSpec spec) {
        Instrument instrument = null;
        if (spec instanceof GuitarSpec) {
            instrument = new Guitar(serialNumber, price, (GuitarSpec) spec);
        }
        if (instrument != null) {
            inventory.add(instrument);
        }
    }

    public Instrument get(String serialNumber) {
        for (Instrument instrument : inventory) {
            if (instrument.getSerialNumber().equals(serialNumber)) {
                return instrument;
            }
        }
        return null;
    }

    public List<Guitar> search(GuitarSpec searchSpec) {
        List<Guitar> matchingGuitars = new LinkedList<>();
        for (Instrument instrument : inventory) {
            if (instrument instanceof Guitar &&
                    ((GuitarSpec) instrument.getSpec()).matches(searchSpec)) {
                matchingGuitars.add((Guitar) instrument);
            }
        }
        return matchingGuitars;
    }
}

