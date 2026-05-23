//Print the greetings(1 = Hello),(2 = Namaste), (3 = Bonjour),(Other = Invalid Botton)
import java.util.*;
public class conditional4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        sc.close();

        switch(button){
            case 1:
            System.out.println("Hello");
            break;

            case 2:
            System.out.println("Namaste");
            break;

            case 3:
            System.out.println("Bonjour");
            break;

            default:
            System.out.println("Invalid Button");

        }
    }
    
}
