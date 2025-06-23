package com.intern;
import java.util.Scanner;
public class Calculator {
	
	   public static double add(double a, double b){
		     return a+b;
		   }
		   public static double subtract(double a, double b){
		     return a-b;
		   }
		   public static double multiply(double a, double b){
		     return a*b;
		   }
		   public static double divide(double a, double b){
		      if(b==0){
		           System.out.println("Error: Cannot divided by zero!");
		           return 0;
		      }
		      return a/b;
		   }
	public static void main(String []args) {
		 Scanner scanner = new Scanner(System.in);
	      Boolean continuecalculator = true;
	      
	      while(continuecalculator){   
	          System.out.println("\n----Basic Calculator-----");
	          System.out.println("Choose an operation:");
	          System.out.println("1. Addition");
	          System.out.println("2. Substraction");
	          System.out.println("3. Multiplication");
	          System.out.println("4. Division");
	          System.out.println("5. Exit");
	          System.out.println("Enter your choice(1-5):");
	          int choice = scanner.nextInt();
	          
	          if(choice == 5)
	          {
	             continuecalculator = false;
	             System.out.println("Exiting calculator. GoodBye!");
	             break;
	          }
	          
	          System.out.println("Enter the First value"); 
	          double num1 = scanner.nextInt();

	          System.out.println("Enter the second value");
	          double num2 = scanner.nextInt();
	          
	          double result = 0;
	          
	          switch(choice){
	          case 1:
	             result = add(num1,num2);
	             System.out.println("Result = "+result);
	             break;
	          case 2:
	             result = subtract(num1,num2);
	             System.out.println("Result = "+result);
	             break;
	         case 3:
	             result = multiply(num1,num2);
	             System.out.println("Result = "+result);
	             break;
	         case 4:
	             result = divide(num1,num2);
	             System.out.println("Result = "+result);
	             break;
	        default :
	            System.out.println("Invalid Choice! Please enter a number between 1-5.");
	      }
	  }
      scanner.close();
	}
}

