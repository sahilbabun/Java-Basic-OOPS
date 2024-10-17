interface Animal{
    public void walk();
}

interface Herbivore {

}

class Horse implements Animal, Herbivore{     // here use of multiple inheritance.
    public void walk(){
        System.out.println("walks on field");
    }
}


public class InterfaceOOPS {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.walk();
    }
}
