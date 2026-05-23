// Abstraction :-Using Interfaces/Multiple Inheritance


interface  Animal{
    public void walk();
}

class Horse implements Animal{
   
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Chicken implements Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}
public class OOPS8 {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
    
    }
    
}
