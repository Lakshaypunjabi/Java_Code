//Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
//If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
//If they enter 0 then stop.
//If he/ she scores :
//Marks >=90 -> print “This is Good”
//89 >= Marks >= 60 -> print “This is also Good”
//59 >= Marks >= 0 -> print “This is Good as well”
//	Because marks don’t matter but our effort does.
//(Hint : use do-while loop but think & understand why)

import java.util.*;
public class Iteration4 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number between 0 and 1:");

        int n= sc.nextInt();

        if(n == 1){
            System.out.println("Enter the marks, because you enter 1:");

            int marks = sc.nextInt();
            sc.close();
            
            if(marks >= 90){
                System.out.println("This is Good");
            }
            else if(marks<= 89 && marks >= 60){
                System.out.println("This is alse Good");
            }
            else{
                System.out.println("This is Good as well");
            }
        }
        else{
            System.out.println("Invalid Input");
        }
    }
    
}
