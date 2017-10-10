package com.spring.practice.repositoy;

import com.spring.practice.model.Category;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sit on 10.10.2017.
 */
public class Repository extends Database {
    public Repository(){
        super();
    }

    public List<Category> displaySavedDecl(){
        List<Category> list = new ArrayList<>();

        try (Connection conn = super.getConnection()){
            

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
