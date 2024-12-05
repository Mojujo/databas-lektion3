package se.oscar;

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
}
