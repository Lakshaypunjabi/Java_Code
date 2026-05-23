class Student {
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class OOPS2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Lakshay";
        s1.age = 20;
        s1.printInfo();
        Student s2 = new Student();
        s2.name ="Urmila";
        s2.age = 18;
        s2.printInfo();
    }
}
