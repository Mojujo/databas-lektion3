package se.oscar;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface StudentDAO {
    void insertPerson(Student student, Connection conn) throws SQLException;
    void updatePerson(Student student, Connection conn) throws SQLException;
    void deletePerson(int id) throws SQLException;
    Student getPerson(int id) throws SQLException;
    List<Student> getStudents() throws SQLException;
}