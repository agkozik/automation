package by.kozik.app;

public abstract class Transport {

    private int wheelCount;
    private int passengerCount;
    //

    private String gearbox;
    //


    public Transport(int wheelCount, int passengerCount, String gearbox) {
        this.wheelCount = wheelCount;
        this.passengerCount = passengerCount;
        this.gearbox = gearbox;
    }

    public int getWheelCount() {
        return wheelCount;
    }
    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }


    public int getPassengerCount() {
        return passengerCount;
    }
    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    public String getGearbox() {
        return gearbox;
    }
    public void setGearbox(String gearbox) {
        this.gearbox = gearbox;
    }

    public abstract String getName();
    public abstract boolean move();

    public String Info(){
        return getName()+ ":\n Кол-во колес: "+getWheelCount()+"\n Кол-во пассажиров: "+getPassengerCount()+"\n Тип КПП: "+getGearbox();
    }

    public void showInfo(){
        System.out.println(this.Info());
    }

}
