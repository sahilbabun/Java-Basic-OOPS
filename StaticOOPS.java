class Student{
    String name;
    static String school;

    public static void changeSchool(){
        school = "newSchool";
    }
}

public class StaticOOPS {
    public static void main(String[] args) {
        Student.school = "JMI";
        Student s = new Student();
        s.name = "Tony";
        System.out.println(s.school);
    }
}
