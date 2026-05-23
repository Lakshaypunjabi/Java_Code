//Print the spiral order matrix as output for a given matrix of numbers. 

import java.util.*;
public class twoDarray3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int matrix[][] = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        sc.close();

        System.out.println("The spiral order matrix is : ");
        int rowStart = 0;
        int rowEnd = n-1;
        int colStart = 0;
        int colEnd = m-1;

        //To print the spiral order matrix
        while(rowStart <= rowEnd && colStart <= colEnd){

            //1st case
            for(int col = colStart; col <= colEnd; col++){
                System.out.print(matrix[rowStart][col] + " ");
            }
            rowStart++;

            //2nd case
            for(int row = rowStart; row <= rowEnd; row++){
                System.out.print(matrix[row][colEnd] + " ");
            }
            colEnd--;

            //3rd case
            for(int col = colEnd; col >= colStart; col--){
                System.out.print(matrix[rowEnd][col] + " ");
            }
            rowEnd--;

            //4th case
            for(int row = rowEnd; row >= rowStart; row--){
                System.out.print(matrix[row][colStart] + " ");
            }
            colStart++;

            System.out.println();

        }


    }
}
