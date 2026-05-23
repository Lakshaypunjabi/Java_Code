//For a given matrix of N x M, print its transpose.

import java.util.*;
public class twoDarray2 {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int rows = sc.nextInt();
       int cols = sc.nextInt();


       int[][] numbers = new int[rows][cols];


       //input
       //rows
       for(int i=0; i<rows; i++) {
           //columns
           for(int j=0; j<cols; j++) {
               numbers[i][j] = sc.nextInt();
           }
       }
       sc.close();

       System.out.println("Transpose of a matrix is :");
       //Output
       for(int j=0; j<cols; j++) {
           for(int i=0; i<rows; i++) {
                   System.out.print(numbers[i][j]+" ");
               }
               System.out.println();
           }
   }
}


