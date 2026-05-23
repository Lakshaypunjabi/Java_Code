//Write a function that calculates the Greatest Common Divisor of 2 numbers. 
import java.util.*;
public class function14 {
    public static void printGCD(int n1, int n2){
         while(n1 != n2){
            if(n1 > n2){
                n1 = n1 - n2;
            }else{
                n2 = n2 - n1;
            }
        }
        System.out.println("GCD is : " +n2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n1 : ");
        int n1 = sc.nextInt();
        System.out.print("Enter value of n2 : ");
        int n2 = sc.nextInt();
        sc.close();

        printGCD(n1, n2);
        
    }
}
