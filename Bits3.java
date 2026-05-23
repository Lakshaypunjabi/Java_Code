public class Bits3 {
    public static void main(String[] args) {
        int n=5;//0101
        int pos = 2;
        int bitMask = 1<<pos;
        int NotbitMask = ~(bitMask);

        int newNumber = NotbitMask & n;
        System.out.println(newNumber);

    }
}
