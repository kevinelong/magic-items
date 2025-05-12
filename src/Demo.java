class Animal {
    public void makeSound() {
        System.out.println("Generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    public void fetch() {
        System.out.println("Dog is fetching the ball");
    }
}

public class Demo {
    public static void main(String[] args) {
        Animal animal1 = new Dog(); // Upcasting (implicit)
        animal1.makeSound(); // Output: Woof!

        // Downcasting (explicit)
        Dog dog1 = (Dog) animal1;
        dog1.makeSound(); // Output: Woof!
        dog1.fetch();   // Output: Dog is fetching the ball

        Animal animal2 = new Animal();
        //Dog dog2 = (Dog) animal2; //This will throw ClassCastException at runtime

    }
}