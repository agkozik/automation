package by.kozik.app;

public class Bird extends Animal {
    public Bird(String name, String voice, int age, double weight) {
        super(name, voice, age, weight);
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getVoice() {
        return voice;
    }

    @Override
    public void getInfo() {
        super.getInfo();
    }
}
