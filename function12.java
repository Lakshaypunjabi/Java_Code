//Write a program to enter the numbers till the user wants and at the end it should display
// the count of positive, negative and zeros entered. 

import java.util.*;
public class function12 {
    public static void main(String[] args){
        int positive = 0, negative = 0, zeroes = 0;
        
        System.out.print("Press 1 to continue and 0 to stop : ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n == 1){
            System.out.print("Enter your number : ");
            int number = sc.nextInt();
           

            if(number > 0){
                positive++;
            }else if(number < 0){
                negative++;
            }else{
                zeroes++;
            }
            System.out.println("Press 1 to continue and 0 to stop : ");
            n= sc.nextInt();
            
            
        }
        sc.close();  
        System.out.println("positive :" + positive);
        System.out.println("Negative :" + negative);
        System.out.println("Zeroes :" + zeroes);
    }
}
