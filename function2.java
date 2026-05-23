//Write a Function to Multiply 2 Numbers

import java.util.*;
public class function2 {
    public static int calculateProduct(int a, int b){
        return a*b ;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        sc.close();

        System.out.println(calculateProduct(a, b));
    }
}
