
package ababa;

import java.util.Scanner;


public class Ababa {

    
    public static void main(String[] args) {
         
     Scanner sc = new Scanner(System.in);  
        
  String name, remarks;
  int science, history, math, soc, arts, total;
  double percent;
  System.out.print("Enter name: ");
  name = sc.nextLine();
  
   System.out.print("Enter marks in Science: ");
  science = sc.nextInt();
  
   System.out.print("Enter marks in History: ");
  history = sc.nextInt();
   System.out.print("Enter marks in Math: ");
  math = sc.nextInt();
   System.out.print("Enter marks in Soc: ");
  soc = sc.nextInt();
   System.out.print("Enter marks in Arts: ");
  arts = sc.nextInt();
  
  total = science + history + math + soc + arts;
  percent = total / 5.0;
  
  if (percent >= 91) {
    remarks = "Excellent";
  }else if(percent >= 86) {
    remarks = "Very Good";
  } else if(percent >= 81) {
      remarks = "Good";
  }else if (percent >= 76){
      remarks = "Fair";
  }else if(percent >= 71){
      remarks = "poor";
  }else{
      remarks = "Fail";
  }
  
 
  System.out.println("\n====Student Grade====");
  System.out.println("Name: " +name);
  System.out.println("\nTotal Marks: " +total);
  System.out.println("Total Percentage: " +percent);
  System.out.println("Remarks:" +remarks);
  
 if(percent > 70){
     System.out.println("\nCongrats "+name+" You Passed.");
 }else{
    System.out.println("Try Again!");
     
     
  }
 
    }
}
