//Print the Pattern(Inverted Half Pyramid Rotated by 180 degree)


public class pattern5 {
   public static void main(String args[]) {
       int n = 4;
      
       for(int i=1; i<=n ; i++) {

           //Inner loop => Print Space
           for(int j=1; j<=n-i; j++) {
               System.out.print(" ");
           }

           //Inner loop => Print Star
           for(int j=1; j<=i; j++) {
               System.out.print("*");
           }
           System.out.println();
       }
   }
}

//Output:

//   *
//  **
// ***
//****