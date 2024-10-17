class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // Non-Parametrized Constructor
    // Student(){
    //     System.out.println("constructor called...");
    // }

    // Parametrized Constructor
    // Student(String name, int age) {
    //     this.name = name;
    //     this.age = age;
    // }

    // Copy-Constructor
    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

    Student(){

    }
}

public class Constructors {
    public static void main(String[] args) {
        // Student s1 = new Student();
        // Student s1 = new Student("Student", 24); // Parametrized Constructor
        Student s1 = new Student();
        s1.name = "Student";
        s1.age = 24;

        Student s2 = new Student(s1);
        s2.printInfo();
    }
}
