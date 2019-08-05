public class DogTest extends TestMain {


    Dog dog = new Dog();

    @Override
    IAnimal getAnimal() {
        return dog;
    }


}