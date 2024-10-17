// Single Level Inheritance
/*
class Shape {
    public void area(){
        System.out.println("displays area");
    }
}

class Triangle extends Shape {
    public void area(int l, int h){ 
        System.out.println(0.5*l*h);
    }
}

public class TypesOfInheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.area(2,8);
    }
}
*/


// MultiLevel inheritance
/*
class Shape {
    public void area(){
        System.out.println("displays area");
    }
}

class Triangle extends Shape {
    public void area(int l, int h){
        System.out.println(0.5*l*h);
    }
}

class Equilateral extends Triangle {
    public void area(int l, int h){
        System.out.println(0.5*l*h);
    }
}

public class TypesOfInheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.area(2,8);
    }
}
*/


// Hierarchical Inheritance

// class Shape {
//     public void area(){
//         System.out.println("displays area");
//     }
// }

// class Triangle extends Shape {
//     public void area(int l, int h){
//         System.out.println(0.5*l*h);
//     }
// }

// class Circle extends Shape {
//     public void area(int r){
//         System.out.println((3.14)*r*r);
//     }
// }

// public class TypesOfInheritance {
//     public static void main(String[] args) {
//         Triangle t1 = new Triangle();
//         t1.area(2,8);
//         Circle c1 = new Circle();
//         c1.area(4);
//     }
// }






