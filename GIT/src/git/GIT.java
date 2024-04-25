/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package git;

import java.util.Scanner;

/**
 *
 * @author ANNISA D YANSAF
 */

public class GIT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myScanner = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount();


        if (BankAccount.Verification()){
            System.out.println("Verivication Success");
            boolean next = true;
            
            while (next == true){
                System.out.println("A. Withdrawal");
                System.out.println("B. Deposit");
                System.out.println("C. Convert Credit to Cash");
                System.out.println("Choose Banking Service (A/B/C) : ");
                String service = myScanner.nextLine();
                if (service.equalsIgnoreCase("a")){
                    BankSystem.Withdrawal(bankAccount);
                }else if (service.equalsIgnoreCase("b")){
                    BankSystem.Deposit(bankAccount);
                }else if (service.equalsIgnoreCase("c")){
                    BankSystem.Credit(bankAccount);
                }
            
                System.out.println("Do you want to make another transaction? (y/n) ");
                String ifNext = myScanner.nextLine();
                if (ifNext.equalsIgnoreCase("y")){
                    next = true;
                }else{
                    next = false;
                }
            }
        }else{
            System.out.println("Verification failed");
        }
    }
    
}
