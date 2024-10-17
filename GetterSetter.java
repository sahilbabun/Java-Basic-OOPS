class Person {
    // Private variables
    private String name;
    private int age;

    // Getter method for 'name'
    public String getName() {
        return name;
    }

    // Setter method for 'name'
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for 'age'
    public int getAge() {
        return age;
    }

    // Setter method for 'age'
    public void setAge(int age) {
        // Additional logic can be added to validate age before setting it
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative!");
        }
    }
}

public class GetterSetter {
    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person();

        // Use setter methods to set values
        person.setName("John");
        person.setAge(25);

        // Use getter methods to retrieve values
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
