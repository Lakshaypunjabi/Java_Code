//Default Constructor / Non-Parameterized Constructor:

// class Student{
//    String name;
//    int age;

//    Student(){
//        System.out.println("Constructor Called");
//    }
// }

// public class OOPS3 {
//    public static void main(String[] args) {
//        Student s1 = new Student();
//    }    
// }

//Parameterized Constructor:

// class Student{
//     String name;
//     int age;

//     Student(String name, int age){
//         this.name = name;
//         this.age = age;
//     }
// }

// public class OOPS3 {
//    public static void main(String[] args) {
//       Student s1 = new Student("Lakshay",20);
//       System.out.println("Student Name :" + s1.name + " and Student Age :"+s1.age);
//     }    
// }

//Copy Constructor:

class Student{
        String name;
        int age;

        public void printInfo(){
            System.out.println(this.name);
            System.out.println(this.age);
        }

        Student(Student s2){
            this.name = s2.name;
            this.age = s2.age;
        }
        Student(){
            
        }
    }
    
    public class OOPS3 {
       public static void main(String[] args) {
          Student s1 = new Student();
          s1.name ="lakshay";
          s1.age = 20;
          Student s2 = new Student(s1);

          s2.printInfo();
        //   System.out.println("Student Name :" + s1.name + " and Student Age :"+s1.age);
        }    
    }
