package by.kozik.app;

public class Main {

    public static void main(String[] args) {

    IAnimal crow =new Bird("Crow", "Kar-Kar",1,0.79);
       crow.getInfo();
       IAnimal dog = new Dog("Sharic","Kar-kar",3,2.05);
       dog.getInfo();
    }
}
