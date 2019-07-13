package by.kozik.app;

public class Animal {
    private int age=1;
    private double weight=2.5;
    private String color="white";
    private String status="is sleeping";

    public Animal(int age, double weight, String color, String status) {
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.status = status;
    }

   public int getAge (){
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor (){
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getStatus (){
        return status;
    }

    public void setStatus (String go){
        this.status=status;
    }
public void animalInfo (){
    System.out.print("Возраст: "+getAge()+", вес: "+getWeight()+", окрас: "+getColor()+", сейчас: "+getStatus());
}

}
