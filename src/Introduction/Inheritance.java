class Animal {
    void eat() {
        System.out.println("Animal eats...");
    }

    void sleep() {
        System.out.println("Animal sleeps...");
    }
}

class Bird extends Animal {
    void eat() {
        System.out.println("Bird eats...");
    }

    void sleep() {
        System.out.println("Bird sleeps...");
    }

    void fly() {
        System.out.println("Bird flies...");
    }
}

public class Inheritance {
    // Create a class named ‘Animal’ which includes methods like
    // eat() and sleep()

    // Create a child class of Animal named ‘Bird’ and override
    // the parent class methods. Add a new method named fly().

    // Create an instance of Animal class and invoke the eat and
    // sleep methods using this object.

    // Create an instance of Bird class and invoke the eat, sleep and
    // fly methods using this object.
    public static void main(String[] args) {
        Animal animal = new Animal();
        Bird bird = new Bird();

        animal.eat();
        animal.sleep();

        bird.eat();
        bird.sleep();
        bird.fly();
    }
}
