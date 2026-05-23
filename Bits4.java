import java.util.*;
public class Bits4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        sc.close();

        int n=5;//0101
        int pos = 1;
        int bitMask = 1<<pos;

        if(oper == 1){
        //Set
        int newNumber = bitMask | n;
        System.out.println(newNumber);
        }else{
            //clear
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }
    }
}
