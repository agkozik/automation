package by.kozik.app;

public class Bicycle extends Transport {

    public Bicycle(int wheelCount, int passengerCount, String gearbox) {
        super(wheelCount, passengerCount, gearbox);
    }


   @Override
    public String getName() {
        return "Bike";
    }

    @Override
    public boolean move() {
        return false;
    }

    @Override
    public String Info() {
        return super.Info()+"\n Is "+getName()+ " move? - "+move();
    }
}
