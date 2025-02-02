package interfaceGarage;

public class Truck extends Vehicle {

    private static final int NUM_OF_WHEELS = 6;

    public Truck(String model) {
        super(model);
    }

    @Override
    public int getFixTime() {
        return 10;
    }

    @Override
    public void fixed() {
        System.out.println("Truck is fixes - " + NUM_OF_WHEELS + " wheels");
    }
    public static Truck build(String model) {
        // return new car with the model name;
        return new Truck(model);    }
}