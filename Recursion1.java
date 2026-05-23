//Print numbers from 5 to 1.

public class Recursion1 {
    public static void printNumbers(int n) {
        if(n == 0) {//Base case
        return;
        }

        System.out.println(n);
        printNumbers(n-1); //Recursion 
        }

        public static void main(String[] args) {
            int n=5;
            printNumbers(n);
        }
}

// public class Recursion1 {
//     public static void printNumbers(int n) {
//         if(n == 1) {//Base case
//             System.out.println(n);
//             return;
//         }

//         printNumbers(n-1);       //Recursion 
//         System.out.println(n);
//         ;  
//         }

//         public static void main(String[] args) {
//             int n=10;
//             printNumbers(n);
//         }
// }
