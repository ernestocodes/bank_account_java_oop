import java.util.*;
public class BankAccountTest{
    public static void main(String[] args){

        BankAccount myaccount = new BankAccount();

        myaccount.deposit("checking", 200.00);
        myaccount.withdraw("checking", 100.00);
        myaccount.deposit("savings", 400.00);
        myaccount.withdraw("savings", 100.00);
        myaccount.getChecking();
        myaccount.getSavings();
        myaccount.seeTotal();
        myaccount.withdraw("saving", 500.00);
    }
}