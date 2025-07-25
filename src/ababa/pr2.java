
package ababa;

import java.util.Scanner;


public class pr2 {
    
      public static void main(String[] args) {
        
     Scanner sc = new Scanner(System.in);  
        
   int num;
   
   do{
   System.out.print("Enter a number: ");
   num = sc.nextInt();
   
   
   if (num ==0){
       System.out.println("Inputted number Zero");
   }else if (num %2 != 0){
       System.out.println("Inputted number is Odd");
   }else{
      System.out.println("Inputted number is Even");
       
       
   }
   
   }while(num !=0);
   
  System.out.println("End");
    }
}

