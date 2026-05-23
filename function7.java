//Enter 3 numbers from the user & make a function to print their average.

import java.util.*;
public class function7 {
    public static int printaverage( int a, int b, int c){
        int average = (a+b+c)/3;
        System.out.print(average);
        return average;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter value of b: ");
        int b = sc.nextInt();
        System.out.print("Enter value of c: ");
        int c = sc.nextInt();
        sc.close();

        printaverage(a, b, c);
    }
}
