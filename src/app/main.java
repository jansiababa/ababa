
package app;

import bank.bankclass;
import java.util.Scanner;


public class main {
   public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        
        
        System.out.println("HELLO WELCOME TO THE SYSTEM!");
        System.out.println("What is your choice for today!?");
        System.out.println("1.Banking");
        System.out.println("2.Doctors Appointment");
        System.out.println("3.Shopping");
        
        bankclass bApp[] = new bankclass[10];
        int size = 0;
        
        System.out.print("Enter Choice: ");
        int choice = sr.nextInt();
        
        switch(choice){
            case 1:
                int resp;
                do {
                System.out.println("1.Register Account");
                System.out.println("2.Login Account");
                System.out.println("3.View All Accounts");
                System.out.println("Enter Selection");
                int action = sr.nextInt();
                switch(action){
                    case 1:
                        bApp[size] = new bankclass();
                        
                        System.out.print("Enter Account No: ");
                        bApp[size].setAccountNo(sr.nextInt());
                        
                        System.out.print("Enter Pin: ");
                        bApp[size].setPin(sr.nextInt());
                       
                        System.out.println("Account Registered Successfully");
                         size++;
                        break;
                    case 2:
                       int attempts = 3;
                       boolean found = false;
                       
                       while(attempts > 0 && !found){
                           System.out.println("Enter Account No: ");
                           int acc = sr.nextInt();
                           
                           System.out.println("Enter Pin: ");
                           int pn = sr.nextInt();
                           
                           for(int i = 0; i < size; i++){
                               if(bApp[i].verifyAccount(acc, pn)){
                                   System.out.println("LOGIN SUCCESSFUL");
                                   found = true;
                                   break;
                               }
                                 }
                               if(!found){
                                 attempts--;
                                 if(attempts < 0){
                                     System.out.println("ATTEMPTS LIMIT REACHED!");
                                     System.out.println("Access Denied.");
                                 }else{
                                     System.out.println("Login failed");
                                     System.out.println("Attempts left: "+attempts);
                                     System.exit(0);
                               
                               }
                           }
                       }
                        break;
                    default:
                        
                    case 3:
                        break;
                   
                }
                    System.out.println("Do you want to continue? (1 = Yes/No = 0)");
                     resp = sr.nextInt();
                }while(resp == 1);
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.println("Invalid! Section.");
                System.out.println("Try again.");
        }
    }
}