
/*
 * Create an abstract class Compartment to represent a rail coach. Provide an abstract function notice in this class.
 * public abstract String notice();
 * Derive FirstClass, Ladies, General, Luggage classes from the compartment class. 
 * Override the notice function in each of them to print notice message that is suitable to the specific type of compartment.
 * Create a class TestCompartment.Write main function to do the following:
 * Declare an array of Compartment of size 10.Create a compartment of a type as decided by a randomly generated integer in the range 1 to 4.
 * Check the polymorphic behavior of the notice method.[i.e based on the random number genererated, the first compartment can be Luggage, the second one could be Ladies and so on..]
 */

abstract class Compartment {
    public abstract String notice();
}

class FirstClass extends Compartment {
    public String notice() {
        return "This is FirstClass Compartment";
    }
}

class Ladies extends Compartment {
    public String notice() {
        return "This is Ladies Compartment";
    }
}

class General extends Compartment {
    public String notice() {
        return "This is General Compartment";
    }
}

class Luggage extends Compartment {
    public String notice() {
        return "This is Luggage Compartment";
    }
}

public class TestCompartment {
    public static void main(String[] args) {
        Compartment[] cp = new Compartment[10];
        for (int i = 0; i < cp.length; i++) {
            int random = (int) (Math.random() * 4) + 1;

            switch (random) {
                case 1:
                    cp[i] = new FirstClass();
                    break;
                case 2:
                    cp[i] = new Ladies();
                    break;
                case 3:
                    cp[i] = new Luggage();
                    break;
                case 4:
                    cp[i] = new General();
                    break;
            }
            System.out.println(cp[i].notice());
        }

    }
}
