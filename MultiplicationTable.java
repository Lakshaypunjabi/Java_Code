//Make a program that prints the table of a number that is input by the user.
import java.util.*;
public class MultiplicationTable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");

        int num = sc.nextInt();
        sc.close();
        for(int i=1; i<=10; i++){
            System.out.println(num+"*"+i+"="+ num*i);
        }
    }  
}
