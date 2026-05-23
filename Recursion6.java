//Print x^n (with stack height = n)

class Recursion6 {
    public static int printPower(int x, int n) {
        if(n == 0) {
            return 1;
        }

        if(x == 0) {
            return 0;
        }

        int xpownm1 = printPower(x, n-1);
        int xpown = x * xpownm1;
        return xpown;
    }
    public static void main(String args[]) {
        int x = 2, n = 5;
        int output = printPower(x, n);
        System.out.println(output);
    }
}