package Assignment;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age); // Call the constructor of the superclass
    }

    @Override
    public String sound() {
        return "Meow"; // Provide specific implementation for Cat
    }
}
