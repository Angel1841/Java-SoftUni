package HirerachicalInheritance;

public class Main {
    public static void main(String[] args) {

        Animal parrot = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        parrot.eat();

        dog.eat();
        dog.bark();

        cat.eat();
        cat.meow();
    }
}
