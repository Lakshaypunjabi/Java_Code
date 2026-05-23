//Print the pattern(Solid Rectangle)

public class pattern1 {
   public static void main(String args[]) {
    
       int n = 4;
       int m = 5;
       for(int i=1; i<=n; i++) {          //Outer loop
           for(int j=1; j<=m; j++) {      //Inner loop
               System.out.print("*");
           }
           System.out.println();
       }
   }
}

//Otput:

//*****
//*****
//*****
//*****