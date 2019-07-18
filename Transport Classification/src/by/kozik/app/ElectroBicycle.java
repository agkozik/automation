package by.kozik.app;

public class ElectroBicycle extends Transport {

    private  String fuel;

   public ElectroBicycle(int wheelCount, int passengerCount, String gearbox, String fuel) {
        super(wheelCount, passengerCount, gearbox);
        this.fuel = fuel;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    @Override
    public String getName() {
        return "ElectroBike";
    }

    @Override
    public boolean move() {
        return true;
    }

    @Override
    public String Info() {
        return super.Info()+"\n Тип топлива: "+getFuel()+"\n Is "+getName()+ " move? - "+move();
    }
}
