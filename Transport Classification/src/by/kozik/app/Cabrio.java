package by.kozik.app;

public class Cabrio extends Cars {

    public Cabrio(int wheelCount, int passengerCount, String gearbox, boolean cabrio, int doorCount, String fuel) {
        super(wheelCount, passengerCount, gearbox, cabrio, doorCount, fuel);
    }

    @Override
    public String getName() {
        return "Cabrio";
    }

    @Override
    public boolean move() {
        return true;
    }

    @Override
    public String Info() {
        return super.Info()+ "\n Is "+getName()+ " move? - "+move();
    }

}
