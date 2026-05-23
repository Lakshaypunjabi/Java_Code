//Print the factorial of a number n

class Recursion5 {
    public static void printFactorial(int n, int fact) {
        if(n == 0) {
        System.out.println(fact);
        return;
        }
        fact *= n;
        printFactorial(n-1, fact);
    }
    public static void main(String args[]) {
        printFactorial(5, 1);
    }
}


//public static int fact(int n) {
//    if(n == 0 ||n == 1) {
//        return 1;
//    }
//    int fnm1 = fact(n-1);
//    int fn= n*fnm1;
//    return fn;
//}

//public static void main(String args[]) {
//    int n=5;
//    System.out.println(fact(5));
//}
