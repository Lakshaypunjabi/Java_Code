//Find the no of ways in which you can invite n people to your party, Single or in Pair.

public class Recursion20 {
    public static int callGuests(int n){
        if(n<=1){
            return 1;
        }

        // Single
        int Ways1 = callGuests(n-1);

        // Pair
        int Ways2 = (n-1) * callGuests(n-2);

        return Ways1 + Ways2;

    }    
    public static void main(String[] args) {
        int n= 4;
        System.out.println(callGuests(n));
    }
}
