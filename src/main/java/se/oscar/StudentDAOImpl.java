package se.oscar;

import se.oscar.utility.loggerUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class StudentDAOImpl implements StudentDAO {
    Student student;

    private Student studentJoin(int id, Connection conn) {
        String sql = """
                Select s.student_id, s.first_name, s.last_name, s.age, t.teacher_id, t.name
                FROM LEKTION3.STUDENT s
                LEFT JOIN LEKTION3.TEACHER t
                ON s.teacher_id = t.teacher_id
                WHERE s.student_id = ?
                """;

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                Teacher teacher = new Teacher(
                        rs.getInt("teacher_id"),
                        rs.getString(("name")));

                student = new Student(
                        rs.getInt("student_id"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getInt(("age")),
                        teacher);
            }

        } catch (SQLException e) {
            loggerUtil.logError("Error joining tables", e);
        }
        return student;
    }

    @Override
    public void insertPerson(Student student, Connection conn) {

    }

    @Override
    public void updatePerson(Student student, Connection conn) {

    }

    @Override
    public void deletePerson(int id) {

    }

    @Override
    public Student getPerson(int id) {

        return student;
    }

    @Override
    public List<Student> getStudents() {
        return List.of();
    }
}
