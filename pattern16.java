//Print the Pattern(Hollow Rohmbus)

public class pattern16 {
   public static void main(String args[]) {
       int n = 5;


       for(int i=1; i<=n; i++) {
           //spaces
           for(int j=1; j<=n-i; j++) {
               System.out.print(" ");
           }


           //stars
           for(int j=1; j<=n; j++) {
            if(i==1 || j==1 || i==n ||j==n){
               System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
           }
           System.out.println();
       }
   }   
}

//Output:

//    *****
//   *   *
//  *   *
// *   *
//*****
