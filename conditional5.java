//Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
//	1 : + (Addition) a + b
//2 : - (Subtraction) a - b
//3 : * (Multiplication) a * b
//4 : / (Division) a / b
//5 : % (Modulo or remainder) a % b
//Calculate the result according to the operation given and display it to the user.

import java.util.*;
public class conditional5 {
    public static void main(String[] args){
        char operator;
        int number1, number2, result;

        Scanner sc = new Scanner(System.in);
        System.out.print("Choose an Operator: +, -,*,/ or %  : ");
        operator= sc.next().charAt(0);

        System.out.print("Enter First Number:");
        number1 = sc.nextInt();

        System.out.print("Enter Second Number:");
        number2 = sc.nextInt();

        sc.close();

        switch(operator){

            case'+':
            result = number1 + number2;
            System.out.println(number1+ "+" +number2+ "="+ result);
            break;

            case'-':
            result = number1 - number2;
            System.out.println(number1+ "-" +number2+ "="+ result);
            break;

            case'*':
            result = number1 * number2;
            System.out.println(number1+ "*" +number2+ "="+ result);
            break;

            case'/':
            result = number1 / number2;
            System.out.println(number1+ "/" +number2+ "="+ result);
            break;

            case'%':
            result = number1 % number2;
            System.out.println(number1+ "%" +number2+ "="+ result);
            break;

            default:
            System.out.println("Invalid Operator");
            break;

            
        }
    }
    
}
