package by.kozik.app;

public abstract class Animal implements IAnimal {
    String name;
    String voice;

    int age;
    double weight;

    public Animal(String name, String voice, int age, double weight) {
        this.name = name;
        this.voice = voice;
        this.age = age;
        this.weight = weight;
    }


    public abstract int getAge();


    public abstract double getWeight();


    public abstract String getName();


    public abstract String getVoice();


    @Override
    public void getInfo() {

        if (this instanceof Bird && voice == "Kar-Kar") {
            System.out.println("Name: " + getName() + " Age: " + getAge() + " Weight: " + getWeight() + " Voice: " + getVoice());
        } else if ((!(this instanceof Bird)) && (voice == "Kar-Kar")) {
            throw new MyFavoryteException(this.name + " Can't say: " + voice);

        } else if (((this instanceof Bird)) && (voice != "Kar-Kar")) {

            throw new MyFavoryteException(this.name + " Can't say: " + voice);

        } else
            {
            System.out.println("Name: " + name + " Age: " + age + " Weight: " + +weight + " Voice: " + voice);


        }

    }
}