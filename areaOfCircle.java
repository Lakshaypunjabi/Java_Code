//Make a program that takes the radius of a circle as input, 
//calculates its radius and area and prints it as output to the user.
import java.util.*;
public class areaOfCircle {
    public static void main (String[] args){
        int r;
        double pi= 3.14, area;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the radius of circle:");

        r= scn.nextInt();
        scn.close();
        area= pi*r*r;
        System.out.println("The area of circle is:" +area);
    }
}
