package by.kozik.app;

public class FlatsBuilding extends Buildings{
    public FlatsBuilding(String name, String type, int stage, int countRooms) {
        super(name, type, stage, countRooms);
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getType() {
        return null;
    }

    @Override
    public int getStage() {
        return 0;
    }

    @Override
    public int getCountRooms() {
        return 0;
    }

    @Override
    public void getProperties() {
        super.getProperties();
        System.out.println(" + Waterpipe / WC / Balcone");
    }
}
