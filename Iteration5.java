//Print the number is prime or not
import java.util.*;
public class Iteration5 {
    public static void main(String[] args) {

        int n , Count = 0;
        System.out.println("Enter any number:");

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i=1 ; i<=n ; i++){
            if(n % i == 0){
                Count++;
            
            }
        }
        if(Count == 2){
            System.out.println("Prime");
        }else{
            System.out.println("not prime");
        }
    }
}
