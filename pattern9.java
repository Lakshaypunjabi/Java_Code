//Print the Pattern(0-1 Triangle)


public class pattern9 {
   public static void main(String args[]) {
       int n = 5;


       for(int i=1; i<=n; i++) {         //Outer loop
           for(int j=1; j<=i; j++) {     //Inner loop

                int sum = i+j;

                if(sum % 2 == 0) {          //Even
                   System.out.print("1");
                } 
                else {                     //Odd
                   System.out.print("0");
                }

            }
            System.out.println();
        }
    }
}

//Outut:

//1
//01
//101
//0101
//10101
