//Print the Pattern(Half Pyramid)

public class pattern3 {
   public static void main(String args[]) {
       int n = 4;
      
       for(int i=1; i<=n; i++) {          //Outer loop
           for(int j=1; j<=i; j++) {      //Inner loop
                   System.out.print("*");
           }
           System.out.println();
       }
   }
}

//Output:

//*
//**
//***
//****
