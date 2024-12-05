package se.oscar;

public class StudentDAO {


    private void studentJoin() {
        int studentId = 1;
        String sql = """
            Select s.student_id, s.first_name, s.last_name, s.age, t.teacher_id, t.name
            FROM students s
            LEFT JOIN teachers t
            ON s.teacher_id = t.teacher_id
            """;
    }
}
