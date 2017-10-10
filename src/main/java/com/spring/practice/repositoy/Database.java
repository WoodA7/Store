package com.spring.practice.repositoy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;

/**
 * Created by Sit on 10.10.2017.
 */
public abstract class Database {
    private static final String JDBC_DRIVER = "org.postgres.Driver";
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/Store";
    private static final String USER = "postgres";
    private static final String PASSWORD = "admin";

    public Database() {
        init();
    }

    private void init() {
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, USER, PASSWORD);
    }

}
