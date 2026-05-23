//Print the Pattern(Pascal Triangle)

public class pattern17 {
   public static void main(String args[]) {
       int n = 4, ncr=1;


       for(int i=0; i<=n; i++) {
           //spaces
           for(int j=0; j<=n-i; j++) {
               System.out.print(" ");
           }


           //numbers
           for(int j=0; j<=i; j++) {
            if(j==0 || i==0)
               ncr =1;
            else
            ncr= ncr*(i-j+1)/j;
                System.out.print(" "+ncr);   
           }
           System.out.println();
       }
   }   
}

//Output:

//      1
//     1 1
//    1 2 1
//   1 3 3 1
//  1 4 6 4 1
