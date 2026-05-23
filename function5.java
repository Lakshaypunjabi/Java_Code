//Make a function to check if a given number n is even or not.

import java.util.*;
public class function5 {
    public static void printEven(int x){
        if(x <= 0){
            System.out.println("Invalid number");
            return;
        }

        if(x % 2== 0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
            
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value to check if number is Even or Odd:");
        int x= sc.nextInt();
        sc.close();

        printEven(x);
    }
}
