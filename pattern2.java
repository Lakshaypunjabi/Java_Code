//Print the Pattern(Hollow Rectangle)

public class pattern2 {
   public static void main(String args[]) {
       int n = 4;
       int m = 5;
       for(int i=1; i<=n; i++) {         //Outer loop
            for(int j=1; j<=m; j++) {     //Inner loop
                
               if(i == 1 || i == n || j == 1 || j == m) {
                   System.out.print("*");
               } else {
                   System.out.print(" ");
               }
           }
           System.out.println();
       }
   }
}

//Output:

//*****
//*   *
//*   *
//*****