package chapterthree;

public class Acc {

        private String name;
        private double balance;

        public Acc(String name, double balance) {
            this.name = name;
            if (balance > 0.0) {
                this.balance = balance;
            }

        }

        public void setName(String name) {
            this.name = name;
        }

        public void deposit(double depositAmount) {
            if (depositAmount > 0.0) {
                this.balance += depositAmount;
            }

        }

        public void withdrawal(double withdrawalAmount) {
            if (withdrawalAmount <= this.balance) {
                this.balance -= withdrawalAmount;
            } else {
                System.out.println("Withdrawal amount exceeded acccount balance");
            }

        }

        public String getName() {
            return this.name;
        }

        public double getBalance() {
            return this.balance;
        }
    }


