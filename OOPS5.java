//Single Inheritance:

// class Animal {
//     public void eat() {
//         System.out.println("eating");
//     }
//  }
//  class Dog extends Animal {
//     public void bark() {
//         System.out.println("barking");
//     }  
//  }
 
//  public class OOPS5 {
//      public static void main(String[] args) {
//         Dog  d = new Dog();
//         d.eat();
//         d.bark();
//      }
//  }




//Multilevel Inheritance:

// class Animal {
//     public void eat() {
//         System.out.println("eating");
//     }
//  }
//  class Dog extends Animal {
//     public void bark() {
//         System.out.println("barking");
//     }  
//  }
//  class BabyDog extends Dog {
//     public void weep() {
//         System.out.println("weeping");
//     }  
//  }
 
//  public class OOPS5 {
//      public static void main(String[] args) {
//         BabyDog  d = new BabyDog();
//         d.eat();
//         d.bark();
//         d.weep();
//      }
//  }

//Hierarchical Inheritance:

class Animal {
    public void eat() {
        System.out.println("eating");
    }
 }
 class Dog extends Animal {
    public void bark() {
        System.out.println("barking");
    }  
 }
 class Cat extends Animal {
    public void meow() {
        System.out.println("meowing");
    }  
 }
 
 public class OOPS5 {
     public static void main(String[] args) {
        Cat c = new Cat();
        c.eat();
        // c.bark(); //Error
        c.meow();
     }
 }

