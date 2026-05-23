//You are a given a number(eg-2019), convert it into a string of english like"two zero one nine"
//use a recursive function to solve this problem. 

public class Recursion23 {
    public static String digits[] = {"zero", "one", "two", "three", "four", "five","six","seven","eight","nine"};
    public static void printDigits(int number){

        if(number == 0){
            return;
        }
        
        
        int lastDigit = number % 10;

        printDigits(number/10);

        System.out.print(digits[lastDigit]+" ");
    }
    public static void main(String[] args) {

        printDigits(1210);
        System.out.println();

    }
}
