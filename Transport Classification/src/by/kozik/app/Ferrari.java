package by.kozik.app;

public class Ferrari extends Cars{
    public Ferrari(int wheelCount, int passengerCount, String gearbox, boolean cabrio, int doorCount, String fuel) {
        super(wheelCount, passengerCount, gearbox, cabrio, doorCount, fuel);
    }

    @Override
    public String getName() {
        return "Ferrari";
    }

    @Override
    public boolean move() {
        return true;
    }

    @Override
    public String Info() {
        return super.Info()+"\n Is "+getName()+ " move? - "+move();
    }
}
