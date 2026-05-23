//Print all even numbers till n

import java.util.*;
public class Iteration3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value:");
        int n = sc.nextInt();
        sc.close();

        for(int i=2;i<=n; i+=2){
            System.out.println(i+ " ");
        }
    }
    
}
