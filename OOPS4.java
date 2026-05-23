//Compile Time Polymorphism(Method Overloading):


// class Student{
//     String name;
//     int age;

//     public void printInfo(String name){
//         System.out.println(name);
//     }
//     public void printInfo(int age){
//         System.out.println(age);
//     }
//     public void printInfo(String name,int age){
//         System.out.println(name+ " "+age);
//     }
// }

// public class OOPS4 {
//     public static void main(String[] args) {
//         Student s1 = new Student();
//         s1.name ="Lakshay";
//         s1.age =20;

//         s1.printInfo(s1.name, s1.age);
//     }
    
// }

//               OR


// class Calculation{
//     int add(int a, int b){
//         return a + b;
//     }

//     double add(double a , double b){
//         return a + b;
//     }
// }

// public class OOPS4 {
//     public static void main(String[] args) {
//         Calculation calc = new Calculation();

//         System.out.println("Sum of integers:" +calc.add(2,3));
//         System.out.println("Sum of doubles:" +calc.add(2.5,3.7));
//     }
// }


//Run Time Polymorphism(Method Overriding):

class Bike{
    void run(){
        System.out.println("running");
    }
} 

class Splendar extends Bike{
    void run(){
        System.out.println("running safely with 60km");
    }
}
public class OOPS4 {
    public static void main(String[] args) {
        Bike b = new Splendar();
        b.run();
    }
    
}