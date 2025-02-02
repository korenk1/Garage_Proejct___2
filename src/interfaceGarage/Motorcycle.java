package interfaceGarage;

public class Motorcycle extends Vehicle {

    private static final int NUM_OF_WHEELS = 2;

    public Motorcycle(String model) {
        super(model);
    }

    @Override
    public int getFixTime() {
        return 3;
    }

    @Override
    public void fixed() {
        System.out.println("Motorcycle is fixes - " + NUM_OF_WHEELS + " wheels");

    }
    public static Motorcycle build(String model) {
        // return new car with the model name;
        return new Motorcycle(model);    }
}
