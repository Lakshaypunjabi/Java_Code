//Make a function to print the number in range if all are prime numbers.

import java.util.*;
public class function17 {
public static boolean isPrime(int n){
    
        
        for(int i= 2; i <=n-1 ;i++){
            if(n % i ==0){
                return false;
            }
        }
        return true;
    }

    public static void primesinRange(int n){
        for(int i=2 ;i<=n ; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args){
       primesinRange(20);
}
}