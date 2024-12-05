package se.oscar;

import java.sql.Connection;
import java.sql.SQLException;

public interface StudentDAO {
    void insertPerson(Student student, Connection conn) throws SQLException;
    Student studentJoin(int id, Connection conn);
}