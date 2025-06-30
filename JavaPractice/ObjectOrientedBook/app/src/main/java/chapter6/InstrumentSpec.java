package chapter6;

import java.util.Map;

// Encapsulates the specifications or features of an instrument

public class InstrumentSpec {
    private Map<String, Object> properties;

    public InstrumentSpec(Map<String, Object> properties) {
        if (properties == null) {
            throw new IllegalArgumentException("Properties map cannot be null.");
        }
        this.properties = properties;
    }

    public Object getProperty(String propertyName) {
        return properties.get(propertyName);
    }

    public Map<String, Object> getProperties() {
        return properties;
    }

    public boolean matches(InstrumentSpec otherSpec) {
        for (String key : otherSpec.getProperties().keySet()) {
            Object value = otherSpec.getProperty(key);
            if (!value.equals(this.getProperty(key))) {
                return false;
            }
        }
        return true;
    }
}
