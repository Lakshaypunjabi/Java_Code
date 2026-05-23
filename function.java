// Print a given name in a function

import java.util.*;
public class function {
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name : ");
        String name = sc.next();
        sc.close();

        printMyName(name);
    } 
    
}
