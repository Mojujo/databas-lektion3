package se.oscar;

import se.oscar.utility.JDBCUtil;
import se.oscar.utility.LoggerUtil;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Student student;

        StudentDAO studentDAO = new StudentDAOImpl();
        try (Connection conn = JDBCUtil.getConnection()) {
            student = studentDAO.studentJoin(6, conn);
            System.out.println(student);
        } catch (SQLException e) {
            LoggerUtil.logError("Error joining student", e);
        }
    }
}