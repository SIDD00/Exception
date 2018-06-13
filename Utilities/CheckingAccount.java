package Utilities;

import UserDefinedExceptions.InsufficientFundsException;

public class CheckingAccount {
    private double balance;
    private int number;
    public CheckingAccount(int number){
        this.number=number;
    }
    public void deposit(double dep){
        balance=balance+dep;
    }
    public void withDraw(double amt)throws InsufficientFundsException {
        if(amt<=balance){
            balance-=amt;
        } else{
            double needs=amt-balance;
            throw new InsufficientFundsException(needs);
        }
    }
    public double getBalance(){
        return balance;
    }
    public int getNumber(){
        return number;
    }
}
