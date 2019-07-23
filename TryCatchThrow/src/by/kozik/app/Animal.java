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

            if (this instanceof Bird)
            {
                System.out.println("Name: " + getName() + " Age: " + getAge() + " Weight: " + getWeight() + " Voice: " + getVoice());
            } else {

                throw new MyFavoryteException("Can not say: kar-kar");
            }
    }
}
