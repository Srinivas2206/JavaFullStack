class Fruit {
    String name;
    String taste;
    int size;

    void eat() {
        System.out.println("Name: " + name);
        System.out.println("Taste: " + taste);
    }
}

class Apple extends Fruit {

    void eat() {
        System.out.println("Apple has sweet-tart taste");
    }
}

class Orange extends Fruit {

    void eat() {
        System.out.println("Orange has sour taste");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Fruit f = new Fruit();
        f.eat();

        Apple a = new Apple();
        a.eat();

        Orange o = new Orange();
        o.eat();
    }
}
