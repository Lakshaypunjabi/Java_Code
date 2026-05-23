//Print the Pattern(Inverted Half Pyramid)

public class pattern4 {
   public static void main(String args[]) {
       int n = 4;
      
       for(int i=n; i>=1; i--) {          //Outer loop
           for(int j=1; j<=i; j++) {      //Inner loop
                   System.out.print("*");
           }
           System.out.println();
       }
   }
}

//Output:

//****
//***
//**
//*


