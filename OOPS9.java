//Static Keyword:


class Student{
    String name;
    static String School;
}

public class OOPS9 {
    public static void main(String[] args) {
        Student.School = "JMV";
        Student s1= new Student();
        Student s2 = new Student();

        s1.name = "Meena";
        s2.name = "Beena";

        System.out.println(s1.School);
        System.out.println(s2.School);
    }
}
