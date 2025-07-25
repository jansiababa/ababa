
package ababa;

import java.util.Scanner;


public class pr3 {
    
       public static void main(String[] args) {
        
     Scanner sc = new Scanner(System.in);   
        
   int num;
   
   do{
   System.out.print("Enter a number: ");
   num = sc.nextInt();
   
   
   if (num > 0){
       System.out.println(num+" is a positive number");
   }else if (num < 0){
       System.out.println(num+" is a negative number");
   }else{
      System.out.println("Inputted number zero");
       
       
   }
   
   }while(num !=0);
   
  System.out.println("End");
    }
}

