package Controller;

import UserDefinedExceptions.InsufficientFundsException;
import Utilities.CheckingAccount;

public class Driver {
    public static void main(String args[]){
        CheckingAccount c=new CheckingAccount(111);
        System.out.println("Depositing 5000 $");
        c.deposit(5000.0);
        try{
            System.out.println("Withdrawing 1000 $");
            c.withDraw(1000.0);
            System.out.println("Withdrawing 5000 $");
            c.withDraw(5000.0);
        }catch (InsufficientFundsException e){
            System.out.println("Sorry Insufficient Balance. You are short of  "+e.getAmt());
        }
    }
}

