//Print the sum of first n natural numbers.(Descending order)

class Recursion3 {
    public static void printSum(int n, int sum) {
        if(n == 0) {
            System.out.println(sum);
            return;
        }
        sum += n;
        printSum(n-1, sum);
    }
    public static void main(String args[]) {
        printSum(5, 0);
    
    }
}

//public static int sumNat(int n) {
//    if(n == 1) {
//        return 1;
//    }
//    int snm1 = sumNat(n-1);
//    int sn= n + snm1;
//    return sn;
//}

//public static void main(String args[]) {
//    int n=5;
//    System.out.println(sumNat(5));
//}
