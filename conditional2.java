import java.util.*;
public class conditional2 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();

        System.out.println("Enter the value of b:");
        int b= sc.nextInt();
        
        sc.close();
        
        if(a == b){
            System.out.println("Equal");
        }
        else if(a > b){
            System.out.println("a is greater");
        }
        else{
            System.out.println("a is lesser");
        }
    }
    
}
