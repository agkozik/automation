public class CatTest extends TestMain {

    Cat cat = new Cat();

    @Override
    IAnimal getAnimal() {
        return cat;
    }
}