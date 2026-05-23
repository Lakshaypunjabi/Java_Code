import java.util.*;
public class conditional1 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the age:");
        int age = sc.nextInt();
        sc.close();
        
        if(age>18){
            System.out.println("adult");
        }
        else{
            System.out.println("Not adult");
        }
    }
    
}
