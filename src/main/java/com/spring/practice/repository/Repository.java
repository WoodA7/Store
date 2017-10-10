package com.spring.practice.repository;

import com.spring.practice.model.Category;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Repository extends Database {

    public Repository() {
        super();
    }

    public List<Category> displayCategories() {
        List<Category> list = new ArrayList<>();

        try (Connection conn = super.getConnection()) {
            

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }
}
