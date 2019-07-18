package by.kozik.app;

public abstract class Cars extends Transport{

    private boolean cabrio;
    private int doorCount;

    private String fuel;

    public Cars(int wheelCount, int passengerCount, String gearbox, boolean cabrio, int doorCount, String fuel) {
        super(wheelCount, passengerCount, gearbox);
        this.cabrio = cabrio;
        this.doorCount = doorCount;
        this.fuel = fuel;
    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public boolean getCabrio() {
        return cabrio;
    }

    public void setCabrio(boolean cabrio) {
        this.cabrio = cabrio;
    }


    @Override
    public String getName() {
        return "Cars";
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
