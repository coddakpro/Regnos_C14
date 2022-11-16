package chapterthree;

public class Account {
    private String name;
    private int pin;
    public int accountNumber;
    private int number;
    private double balance;
    private double deposit;

    public Account() {
        this.name = getName();
        this.pin = number;

        if (balance > 0.0)
            this.name = name;
    }

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double depositAmount){

        if (depositAmount > 0.0)
            balance = balance + depositAmount;
}

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }
}



