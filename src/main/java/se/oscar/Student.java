package se.oscar;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentId == student.studentId && age == student.age && Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName) && Objects.equals(teacher, student.teacher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, firstName, lastName, age, teacher);
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", teacher=" + teacher +
                '}';
    }
}
