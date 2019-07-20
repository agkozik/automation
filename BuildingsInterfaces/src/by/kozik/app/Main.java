package by.kozik.app;

public class Main {

    public static void main(String[] args) {

       HouseInTheCountry houseInTheCountry =new HouseInTheCountry("House","Living",1,4);
       Dacha dacha=new Dacha("Dacha","living",2,3);
       FlatsBuilding flatsBuilding =new FlatsBuilding("FlatBuilding", "Living",9,524);

        objectCountry(houseInTheCountry);
        objectCountry(dacha);
        objectCountry(flatsBuilding);

       Garrage garrage=new Garrage("Garrage", "Non -residential",1,1);
       garrage.getProperties();

       Barn barn =new Barn("Barn","Non-residential",1,3);
       barn.getProperties();

       Store store = new Store("Store","Non-residential",1,0);
       store.getProperties();

        }

    private static void objectCountry (Buildings zdanie){
        zdanie.getProperties();
    }
}
