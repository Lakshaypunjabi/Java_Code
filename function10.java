//Write a function that takes in the radius as input and returns the circumference of a circle.

import java.util.*;
public class function10 {
    public static double printCircumference(double radius){
        return 2* 3.14 *radius;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius : "); 

        double radius = sc.nextDouble();
        sc.close();

        System.out.println(printCircumference(radius));
    }
}