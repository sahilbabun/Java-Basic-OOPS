abstract class Animal{
    abstract void walk();
    Animal(){
        System.out.println("You are creating a new animal..");
    }
    public void eat(){
        System.out.println("Animal can eat.");
    }
}

class Horse extends Animal{
    Horse(){
        System.out.println("Created a Horse...");
    }
    public void walk(){
        System.out.println("Walking on a field area");
    }
}

class Lion extends Animal{
    public void walk(){
        System.out.println("walking on a jungle");
    }
}

public class AbstractionOOPS {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.walk();
        // Lion l = new Lion();
        // l.walk();
        // l.eat();
        // h.eat();
        // Animal a = new Animal();
        // a.walk();   // it cannot be initiated because of abstract keyword.
    }
}
