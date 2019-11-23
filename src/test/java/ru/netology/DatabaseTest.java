package ru.netology;

import com.github.javafaker.Faker;
import lombok.val;
import org.junit.jupiter.api.Test;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseTest {

    @Test
    void testConnection() throws SQLException {
        String dataSQL = "INSERT INTO users(id, login, password) VALUES (?, ?, ?);";
        Faker faker = new Faker();
        val conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/app", "app", "pass");
        val dataStmt = conn.prepareStatement(dataSQL);
        dataStmt.setString(1, "1");
        dataStmt.setString(2, faker.name().username());
        dataStmt.setString(3, "password");
        dataStmt.executeUpdate();
    }
}
