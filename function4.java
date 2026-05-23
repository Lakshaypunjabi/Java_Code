//Make a function to check if a number is prime or not.

import java.util.*;
public class function4 {
    public static boolean printPrime(int num){
        if(num <= 1){
            return false;
        }

        for(int i= 2; i < num/2; i++){
            if(num % 2 ==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to check if number is prime or not :");
        int num = sc.nextInt();

        sc.close();

        if(printPrime(num)){
            System.out.println(num + " is prime number");
        }
        else{
            System.out.println(num + " is not prime number");
        }
         printPrime(num);
    }

}
