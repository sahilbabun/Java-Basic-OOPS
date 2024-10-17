class Shape {
    String color;
}

class Triangle extends Shape {
    public void printInfo(String color){
        System.out.println(color);
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "Red";
        t1.printInfo(t1.color);
    }
}
