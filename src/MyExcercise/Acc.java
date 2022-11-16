package MyExcercise;

public class Acc {
    private String name;
    private double balance; // instance variable

    public Acc(String name, double balance) {

        this.name = name; // assign name to instance variable
        if (balance > 0.0)
            this.balance = balance;
    }

    public void setName(String name) {
        this.name = name; // stores the name


    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0.0)
            balance = balance + depositAmount;
    }

    public void withdrawal(double withdrawalAmount) {
        if (withdrawalAmount <= balance) {
            balance = balance - withdrawalAmount;
        } else {
            System.out.println("Withdrawal amount exceeded acccount balance");
        }

    }

    public String getName() {
        return name;
    }


    public double getBalance() {
        return balance;
    }


}


