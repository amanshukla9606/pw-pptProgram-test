// Animal.java
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog makes sound.");
    }
}


    class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat quarrels.");
    }
}


// Cat.java
    class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cow makes sound.");
    }
}
// Main.java
public class Inheritance {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        Cow cow = new Cow();
        Dog dog = new Dog();

        animal.makeSound();
        cow.makeSound();
        cat.makeSound();
        dog.makeSound();
    }
}