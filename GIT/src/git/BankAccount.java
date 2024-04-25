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
public class BankAccount {
    final private String account = "annisa";
    final private int pin = 123456;
    private int credit = 100;
    private int balance = 1000000;

    public String getAccount() {
        return account;
    }

    public int getPin() {
        return pin;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
     public static boolean Verification(){
        System.out.println("WELCOME TO SIMPLE BANKING APP");
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Input account number : ");
        String acc = myScanner.nextLine();
        System.out.println("Input PIN : ");
        int accPin = myScanner.nextInt();
        
        BankAccount bankAccount = new BankAccount();
        
        if (acc.equals(bankAccount.getAccount()) && accPin == bankAccount.getPin()){
            return true;
        }else{
            return false;
        }
}

}
