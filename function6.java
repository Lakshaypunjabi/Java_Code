//Make a function to print the table of a given number n.

import java.util.*;
public class function6 {
    public static void printTable(int num){
        if( num <=0){
            System.out.println("Invalid Number");
            return;
        }

        for(int i=1; i<= 10; i++){
            System.out.println(num + " * " +i+ " = " + num*i);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value : ");
        int num = sc.nextInt();
        sc.close();

        printTable(num);
    }
}
