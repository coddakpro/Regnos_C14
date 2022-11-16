package MyExcercise;

public class BankAccount {
    public static String customerName;
    public int balance;
    public String accountName;
    public int accountNumber;
    public int phoneNumber;
    public String email;
    public int depositFund;
    public String validCustomer;

    public static void customerName(String customerName) {
        String validCustomerName = customerName.toLowerCase();
        if (validCustomerName.equals("FirstBank") || validCustomerName.equals("unionBank")) {

        }
    }

    public String setAccountName() {
        return this.accountName;
    }

    public String getAccountName() {
        return this.accountName;
    }

    private int setAccountNumber() {
        return accountNumber;

    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public static String setCustomerName(String customerName) {
        String validCustomer = customerName.toLowerCase();
//        if (customerName.equals("Eric")
            return validCustomer;
        }
    }

