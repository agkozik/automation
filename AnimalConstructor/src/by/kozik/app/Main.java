package by.kozik.app;

public class Main {

    public static void main(String[] args) {

        Animal animal=new Animal(10,5,"Brown","Is sleeping");
        //animal.animalInfo();

        Dog dog =new Dog(5, 15.1, "White","Is Running");
        dog.animalInfo();

        Cat cat =new Cat(2,2.5, "Black","Having a lunch");
        cat.animalInfo();

        Bird bird=new Bird(1,0.2, "Grey","Is Flying",true);
        bird.animalInfo();

   }
}
