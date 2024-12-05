package se.oscar;

public class Student {
    private int studentId;
    private String firstName;
    private String lastName;
    private int age;
    private Teacher teacher;

    public Student(String firstName, String lastName, int age, Teacher teacher) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.teacher = teacher;
    }

    public Student(int studentId, String firstName, String lastName, int age, Teacher teacher) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.teacher = teacher;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public Teacher getTeacher() {
        return teacher;
    }
}
