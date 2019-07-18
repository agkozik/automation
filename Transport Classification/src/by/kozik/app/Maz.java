package by.kozik.app;

public class Maz extends Trucks{

    public Maz(int wheelCount, int passengerCount, String gearbox, String fuel) {
        super(wheelCount, passengerCount, gearbox, fuel);
    }

    @Override
    public String openBody() {
        return "Body is Open";
    }

    @Override
    public String getName() {
        return "Maz";
    }

    @Override
    public boolean move() {
        return true;
    }


    @Override
    public String Info() {
        return super.Info()+"\n Is "+getName()+ " move? - "+move()+"\n "+openBody();
    }

}
