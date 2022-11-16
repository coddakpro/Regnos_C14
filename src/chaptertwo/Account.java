package chaptertwo;

import javax.xml.namespace.QName;
import java.util.Objects;
import java.util.jar.Attributes;
import java.util.jar.Attributes.Name;
public class Account {




        private String name;
        private String pin;
        private int balance = 50_000;
        private int accountNumber;
        private double deposite;

        public Account(String name, int number){
            this.name = name;
            accountNumber = number;

        }

        public Account(String helen_mc) {

        }

        public void setAccountName(String accountName,String accountPin,int balance, int accountNumber,double deposite)
        {
            accountName = accountName;
            accountPin = accountPin;
            balance = balance;
        }
        public String getName(){
            return name;
        }

        public void setPin(String pin){
            this.pin = pin; }

        public String getPin(){
            return pin; }

        public void setName(String name){
            this.name = name; }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Account account = (Account) o;
            return balance == account.balance && accountNumber == account.accountNumber && Double.compare(account.deposite, deposite) == 0 && Objects.equals(name, account.name) && Objects.equals(pin, account.pin);
        }

    }

