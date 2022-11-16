package chapterSix.BankApp;

public class BankAccountTest {
    private String name;
    private  int balance = 50_000;
    private String pin;

    public BankAccountTest(String accountName, String accountPin)  {
        name = accountName;
        pin = accountPin;
    }

    public String getAccountName() {
        return name;
    }

    public int getAccountBalance() {
        return balance;
    }

    public int deposit(int account){
        int deposit;
        this.balance = balance + deposite();
        { return deposite(); }
    }

    private int deposite() {
        return 0;
    }

}
