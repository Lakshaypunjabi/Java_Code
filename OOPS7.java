//Abstraction :
//Abstract class


abstract class Animal{
    abstract void walk();
    Animal(){           //Constuctor
        System.out.println("You are about to create an animal");
    }
    public void eat(){                    //Non-abstract method
        System.out.println("Animal eats");

    }
}

class Horse extends Animal{
    Horse(){            //Constuctor
        System.out.println("Creating a Horse");
    }
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}
public class OOPS7 {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        horse.eat();
    }
    
}
