package by.kozik.app;

public class Dog extends Animal {

    public Dog(String name, String voice, int age, double weight) {
        super(name, voice, age, weight);
    }

    @Override
    public int getAge() {
        return 0;
    }

    @Override
    public double getWeight() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getVoice() {
        return null;
    }

    @Override
    public void getInfo() {
        super.getInfo();
    }
}
