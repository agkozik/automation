package by.kozik.app;

public abstract class Buildings implements IBuildings {

    private String name;
    private String type;

    private int stage;
    private int countRooms;

    public Buildings(String name, String type, int stage, int countRooms) {
        this.name = name;
        this.type = type;
        this.stage = stage;
        this.countRooms = countRooms;
    }

    public abstract String getName();

    public abstract String getType();

    public abstract int getStage();

    public abstract int getCountRooms();

    @Override
    public void getProperties() {
        System.out.print (

                " name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", stage=" + stage +
                ", countRooms=" + countRooms);
    }
}
