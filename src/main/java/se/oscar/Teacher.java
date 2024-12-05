package se.oscar;

import java.util.Objects;

public class Teacher {
    private int teacherId;
    private final String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    public Teacher(int teacherId, String teacherName) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return teacherId == teacher.teacherId && Objects.equals(teacherName, teacher.teacherName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teacherId, teacherName);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", teacherName='" + teacherName + '\'' +
                '}';
    }
}
