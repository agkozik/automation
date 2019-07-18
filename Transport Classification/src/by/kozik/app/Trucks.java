package by.kozik.app;

public abstract class Trucks extends Transport{
    private String fuel;
    private int doorCount;

    public Trucks(int wheelCount, int passengerCount, String gearbox, String fuel) {
        super(wheelCount, passengerCount, gearbox);
        this.fuel = fuel;
    }

    public abstract String openBody();

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }

    public int getDoorCount() {
        return doorCount;
    }

    @Override
    public String getName() {
        return "Truks";
    }

    @Override
    public boolean move() {
        return true;
    }

    @Override
    public String Info() {
        return super.Info()+"\n Кол-во дверей: "+getDoorCount()+"\n Тип топлива: "+getFuel();
    }
}
