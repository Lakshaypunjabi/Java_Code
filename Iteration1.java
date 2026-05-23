//Print the sum of first n natural numbers
import java.util.*;
public class Iteration1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value: ");
        int n = sc.nextInt();
        sc.close();

        int sum = 0;
        for(int i=0; i<=n; i++){
            sum = sum+i;
        }
        System.out.println(sum);

    }
    
}
