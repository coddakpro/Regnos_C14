package MyExcercise;

public class BankAccountMain {

    public static void main(String[] args) {
       BankAccount FirstBank = new BankAccount();
       BankAccount.customerName("FirstBank");
        System.out.println("Welcome to FirstBank " + FirstBank.getAccountName());
    }
}
