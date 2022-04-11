import java.util.*;
public class BankAccount{
    private double checkingBalance;
    private double savingsBalance;
    private static int numberOfAccounts;
    private static double totalAmount;

    public BankAccount(){
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        numberOfAccounts ++;
    }

    public void getChecking(){
        System.out.printf("You have $%.2f in your checking.\n", this.checkingBalance);
    }

    public void getSavings(){
        System.out.printf("You have $%.2f in your savings.\n", this.savingsBalance);
    }

    public  void deposit(String account, double amount){
        if(account == "checking"){
            this.checkingBalance += amount;
            this.totalAmount += amount;
        }
        if(account == "savings"){
            this.savingsBalance += amount;
            this.totalAmount += amount;
        }
    }

    public void withdraw(String account, double amount){
        if(amount > this.savingsBalance || amount> this.checkingBalance){
            System.out.println("Insufficient funds!");
        }
        if(account == "checking"){
            this.checkingBalance -= amount;
            this.totalAmount -= amount;
        }
        if(account == "savings"){
            this.savingsBalance -= amount;
            this.totalAmount -= amount;
        }
    }

    public void seeTotal(){
        System.out.printf("Your current total in all accounts is: $%.2f.\n", this.totalAmount);
    }
}
