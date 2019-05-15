package Cars;


public enum Model {

    FOCUS(new Chasis("Hatchback"), new Engine("Petrol")),
    F150(new Chasis("Truck"), new Engine("Diesel")),
    KUGA(new Chasis("SUV"), new Engine("Electric"));

    private final Chasis chasis;
    private final Engine engine;

    Model(Chasis chasis, Engine engine){
        this.chasis = chasis;
        this.engine = engine;
    }

    public String getChasis() {
        return chasis.getType();
    }

    public String getEngine() {
        return engine.getType();
    }
}
