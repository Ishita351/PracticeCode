package chapter5;

public abstract class InstrumentSpec {
    private Builder builder;
    private String model;
    private Type type;

    public InstrumentSpec(Builder builder, String model, Type type) {
        this.builder = builder;
        this.model = model;
        this.type = type;
    }

    public Builder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public boolean matches(InstrumentSpec otherSpec) {
        if (builder != otherSpec.builder) return false;
        if ((model != null) && (!model.equals("") && !model.equalsIgnoreCase(otherSpec.model))) return false;
        if (type != otherSpec.type) return false;
        return false;
    }
}
