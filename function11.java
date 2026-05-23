//Write a function that takes in age as input and returns if that person is eligible to vote or not. 
//A person of age > 18 is eligible to vote.

import java.util.*;
public class function11 {
    public static void printEligible(int age){
        if(age >= 18){
            System.out.println("Eligible for vote");
        }
        else{
            System.out.println("Not eligible for vote");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the age : ");
        int age = sc.nextInt();
        sc.close();

       printEligible(age);
    }
}
