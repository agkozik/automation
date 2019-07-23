package by.kozik.app;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        ArrayList <String>voices = new ArrayList<String>();
        voices.add("Kar-Kar");
        voices.add ("Gav-Gav");

        Random myrandom = new Random();
        String random = voices.get(myrandom.nextInt(voices.size()));

    IAnimal crow =new Bird("Crow", voices.get(0),1,0.79);
    IAnimal dog = new Dog("Sharic",voices.get(1),3,2.05);
    IAnimal pigeon = new Bird("Pigeon",random,1,0.2);

    IAnimal puppy = new Dog ("White Bim",random,3,5);

       dog.getInfo();
       crow.getInfo();
       pigeon.getInfo();
       puppy.getInfo();
    }
}
