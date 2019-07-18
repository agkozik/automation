package by.kozik.app;

public class Main {

    public static void main(String[] args) {
        //Cars cars = new Cars(4,2,"Automat", true,2,"Benzin");
        //cars.ShowInfo();
        Cabrio cab =new Cabrio(4,2,"Auto",true,2,"Benzin");
        cab.showInfo();

        Maz maz=new Maz(6,1,"Manual","Diesel");
        maz.showInfo();

       Bicycle bike =new Bicycle(2,1,"Manual");
        bike.showInfo();
        ElectroBicycle electroBike=new ElectroBicycle(2,0,"Manual","Electro");
        electroBike.showInfo();

    }

}
