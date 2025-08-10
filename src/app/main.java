
package app;

import bank.bankclass;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        System.out.println("Activity 1");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("HELLO WELCOME TO THE SYSTEM!");
        System.out.println("What do you feel doing today? ");
        System.out.println("1. Banking");
        System.out.println("2. Doctors Appointment");
        System.out.println("3. Shopping");
        
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        
        switch(choice){
            case 1:
       
                 int attempts = 3;
                        bankclass bc = new bankclass();

                        System.out.print("Enter your Account No: ");
                        int accountNo = sc.nextInt();

                        System.out.print("Enter your Pin: ");
                        int pin = sc.nextInt();

                        while(!(bc.verifyAccount(accountNo, pin))){
                            if(attempts == 1){
                                System.out.println("ATTEMPT LIMIT REACHED!");
                                System.exit(0);
                            }

                            attempts--;
                            System.out.println("Attempt Left: "+attempts);

                            System.out.println("INVALID ACCOUNT!");
                            System.out.print("Enter your Account No: ");
                            accountNo = sc.nextInt();
                            System.out.print("Enter your Pin: ");
                            pin = sc.nextInt();

                        }
                        

                System.out.println("Enter your Account No: ");
                 accountNo = sc.nextInt();

                System.out.println("Enter your Pin: ");
                 pin = sc.nextInt();
              
                    if(bc.verifyAccount(accountNo, pin)){
                        System.out.println("LOGIN SUCCESS");
                    }else{
                        System.out.println("INVALID ACCOUNT!");
                    }
                
                
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            default:
                System.out.println("Invalid Selection!");
        
        }
            
    }

}

