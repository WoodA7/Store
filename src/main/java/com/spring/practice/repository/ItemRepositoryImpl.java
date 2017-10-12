package com.spring.practice.repository;

import com.spring.practice.model.Item;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ItemRepositoryImpl extends Database implements ItemRepository {

    @Override
    public List<Item> findItemsById(int idCategory) {
        List<Item> list = new ArrayList<>();

        try (Connection conn = super.getConnection()) {

            Statement st = conn.createStatement();

            String query = "SELECT \"Id\", \"IdCategory\", \"Name\", \"Price\", \"Discount\"" +
                    "FROM \"Item\" WHERE \"IdCategory\"="+idCategory;
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                Item item = new Item();
                item.setId(rs.getInt("Id"));
                item.setName(rs.getString("Name"));
                item.setPrice(rs.getDouble("Price"));
                item.setDiscount(rs.getDouble("Discount"));
                list.add(item);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }
}
