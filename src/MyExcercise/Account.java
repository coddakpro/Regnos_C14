package MyExcercise;

public class Account{
    private int number;
    private String name;
    private double balance;

    public Account(String name, int number, double balance){
        this.name = name;
        this.number = number;
        this.balance = balance;
    }

    public void deposit(double deposit){
        if(deposit > 0.0)
            balance = balance + deposit;
        else
            System.out.println("Invalid deposit");
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setNumber(int number){
        this.number = number;
    }
    public int getNumber(){
        return number;
    }
    public void setWitDraw(double withdraw){
        if(withdraw < balance)
            balance = balance - withdraw;
        else
            System.out.println("Cant withdraw more than you have olojo kokoro");

    }
    public double getBalance(){
        return balance;
    }

}


