//Print the fibonacci sequence till nth term.

class Recursion4 {
    public static void printFabonacci(int a, int b, int n) {
        if(n == 0) {
        return;
        }
        
        System.out.println(a);
        printFabonacci(b, a+b, n-1);
    }
    public static void main(String args[]) {
        printFabonacci(0, 1,7);
    }
}

//class Recursion4{

//    public static int printFabn(int n){
//        if(n == 0){
//            return 0;
//        }
//        if(n == 1){
//            return 1;
//        }

//        int fnm1= printFabn(n-1);
//        int fnm2= printFabn(n-2);
//        int fn = fnm1+fnm2;
//        return fn;
//    }
    
//    public static void main(String[] args) {
//        int n = 5;
//        System.out.println(printFabn(n));
//    }
//    }