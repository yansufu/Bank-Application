/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package git;

import java.util.Scanner;

/**
 *
 * @author ANNISA D YANSAF
 */
public class BankSystem {
    
    public static void Withdrawal(BankAccount bankAccount){
        int BalanceNow = bankAccount.getBalance();
        System.out.println("Input withdrawal amount : ");
        Scanner myScanner = new Scanner(System.in);
        int withdraw = myScanner.nextInt();
        if (BalanceNow - withdraw >= 50000){
            BalanceNow = BalanceNow - withdraw;
            bankAccount.setBalance(BalanceNow);
            System.out.println("Withdrawal succeed, your balance is " + BalanceNow);
        }else{
            System.out.println("Withdrawal failed, insufficient balance");
        }
    }
    
    public static void Deposit(BankAccount bankAccount){
        int BalanceNow = bankAccount.getBalance();
        System.out.println("Input deposit amount : ");
        Scanner myScanner = new Scanner(System.in);
        int deposit = myScanner.nextInt();
        if (deposit > 0){
            BalanceNow = BalanceNow + deposit;
            bankAccount.setBalance(BalanceNow);
            System.out.println("Deposit succeed, your balance is " + BalanceNow);
        }else {
            System.out.println("Deposit failed");
        }
    }
    
    public static void Credit(BankAccount bankAccount){
        int creditNow = bankAccount.getCredit();
        System.out.println("Input Credits you want to convert : ");
        Scanner myScanner = new Scanner(System.in);
        int credit = myScanner.nextInt();
        if (credit <= creditNow){
            creditNow = creditNow - credit;
            int BalanceNow = bankAccount.getBalance() +  credit * 1000;
            bankAccount.setBalance(BalanceNow);
            System.out.println("Credit conversion succeed");
            System.out.println("Your balance is " + BalanceNow);
            System.out.println("Your credit is " + creditNow);
        }else{
            System.out.println("Credit conversion failed, not enough credit");
        }
    }
}
