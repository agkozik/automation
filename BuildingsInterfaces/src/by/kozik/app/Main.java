package by.kozik.app;

public class Main {

    public static void main(String[] args) {

       Buildings houseInTheCountry =new HouseInTheCountry("HouseInTheCountry","Living",1,4);
      Buildings dacha=new Dacha("Dacha","living",2,3);
       FlatsBuilding flatsBuilding =new FlatsBuilding("FlatsBuilding", "Living",9,524);

        objectCountry(houseInTheCountry);
        objectCountry(dacha);
        objectCountry(flatsBuilding);

       Garrage garrage=new Garrage("Garrage", "Non -residential",1,1);
       garrage.getProperties();

       Barn barn =new Barn("Barn","Non-residential",1,3);
       barn.getProperties();

       Store store = new Store("Store","Non-residential",1,0);
       store.getProperties();

       //if(barn instanceof Garrage) System.out.println("true");
        //System.out.println(houseInTheCountry.equals(dacha));
        //System.out.println(dacha.getClass());
        //System.out.println(dacha.hashCode());
        System.out.println(dacha.toString());
        }


    private static void objectCountry (Buildings zdanie){
        zdanie.getProperties();
    }
}
