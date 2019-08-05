package by.kozik.app;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Account<Integer> account1=new Account<Integer>(123456,987654);
        Integer account1Id=account1.getId();
        System.out.println(account1Id);

        Account<String> account2=new Account<String>("789101",11111111);
        Integer account2Id=account1.getId();
        System.out.println(account2Id);

        account1.getAccountInfo();
        account2.getAccountInfo();
    }
}
