package SingleInheritance;

public class Main {
    public static void main(String[] args) {

        Animal cat = new Animal();
        Dog dog = new Dog();

        cat.eat();

        dog.eat();
        dog.bark();

    }
}
