package GTMBatch50;

public class Assignment21 {

    static class Animal {
        public void sound() {
            System.out.println("Animal makes a sound");
        }

        public static void sleep() {
            System.out.println("Animal is sleeping");
        }
    }

    static class Mammal extends Animal {
        public void walk() {
            System.out.println("Mammal walks");
        }

        public static void breathe() {
            System.out.println("Mammal is breathing");
        }
    }

    static class Dog extends Mammal {
        public void bark() {
            System.out.println("Dog barks");
        }

        public static void fetch() {
            System.out.println("Dog fetches the ball");
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.sound();
        dog.walk();   
        dog.bark();    

        
        Animal.sleep();  
        Mammal.breathe(); 
        Dog.fetch();     
    }
}
