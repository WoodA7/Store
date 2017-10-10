package com.spring.practice.repository;

import com.spring.practice.model.Category;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CategoryRepositoryImpl extends Database implements CategoryRepository {

    public CategoryRepositoryImpl() {
        super();
    }

    @Override
    public List<Category> findCategories() {

        List<Category> list = new ArrayList<>();

        try (Connection conn = super.getConnection()) {

            Statement st = conn.createStatement();

            String query = "SELECT id, name FROM Category";
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                Category category = new Category();
                category.setId(rs.getInt("id"));
                category.setName(rs.getString("name"));
                list.add(category);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }
}
