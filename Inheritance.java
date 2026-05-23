class Student{
    int rollno, marks;
    String name;
    
    void Input(){
        System.out.println("RollNo, Marks and Name : ");
        
    }
}

class Teacher extends Student{
    void Display(){
        rollno = 4654;
        marks = 100;
        name = "lakshay";

        System.out.println(rollno+ "," +marks+ " and " +name);
        
    }

}
    public class Inheritance {
        public static void main(String[] args){
            Teacher t = new Teacher();
            
            t.Input();
            t.Display();
        }
    
    }
