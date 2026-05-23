//Write a function to calculate the factorial of a number.

import java.util.*;
public class function3 {
   
   public static void printFactorial(int n) {

       //Nagative number(Not allow)
       if(n < 0) {
           System.out.println("Invalid Number");
           return;
       }
       
       //loop
       int factorial = 1;
       for(int i=1; i<=n; i++) {
           factorial = factorial * i;
       }
      
       System.out.println(factorial);
       return;
   }

   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter the value : ");
       int n = sc.nextInt();
       sc.close();


       printFactorial(n);
   }
}

