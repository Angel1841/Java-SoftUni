package MultipleInheritance;

public class Main {
    public static void main(String[] args) {

        Animal cat = new Animal();
        Dog dog = new Dog();
        Puppy puppy = new Puppy();

        cat.eat();

        dog.eat();
        dog.bark();

        puppy.eat();
        puppy.bark();
        puppy.weep();
    }
}
