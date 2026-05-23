//Two numbers are entered by the user, x and n. Write a function to 
//find the value of one number raised to the power of another i.e. xn.

import java.util.*;
public class function13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x : ");
        int x= sc.nextInt();
        System.out.println("Enter n : ");
        int n =  sc.nextInt();
        sc.close();

        int result = 1;

        for(int i=1; i< n; i++){
            result = result * x;
        }
        System.out.println("x to the power n is : " + result * x );
    }
}
