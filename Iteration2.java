//Print the table of a number input by the user

import java.util.*;
public class Iteration2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sc.close();
        System.out.print("Enter the number:");

        int num = sc.nextInt();
        for(int i=1;i<=10; i++){
            System.out.println(num*i);
        }
    }
    
}
