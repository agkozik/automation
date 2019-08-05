public class BirdTest extends TestMain {
    Bird bird = new Bird();

    @Override
    IAnimal getAnimal() {
        return bird;
    }
}
