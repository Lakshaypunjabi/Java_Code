import java.util.*;
public class StringInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        sc.close();

        System.out.println("Your name is:" +name);
    }    
}
