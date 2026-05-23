//Write a Function to add 2 Numbers

import java.util.*;
public class function1 {
    public static int calculateSum(int a, int b){
        int sum = a+b;
        return sum;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        sc.close();

        int sum = calculateSum(a,b);
        System.out.println(sum);
    }
}
