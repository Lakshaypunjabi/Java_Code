//Write a function to covert binary number into decimal number.

public class function18 {
    public static void binToDecm(int binNum){
        int myNum = binNum;
        int pow=0;
        int decNum = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit *(int)Math.pow(2, pow));

            pow++;
            binNum = binNum/10;
        }

        System.out.println("Decimal of "+myNum+" = "+  decNum);
    }

    public static void main(String[] args) {
        binToDecm(101);
    }
}
