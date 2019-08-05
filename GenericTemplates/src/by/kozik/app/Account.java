package by.kozik.app;

public class Account<T> {
    private T id;
    private int sum;

    public Account(T id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public T getId(){return id;}
    public int getSum(){return sum;}

    public void setSum(int sum) {
        this.sum = sum;
    }


    public <T> void getAccountInfo(){

      System.out.println("Account "+getId());
      System.out.println("Total: "+getSum());
    }
}
