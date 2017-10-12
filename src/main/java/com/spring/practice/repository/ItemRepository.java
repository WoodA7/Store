package com.spring.practice.repository;

import com.spring.practice.model.Item;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Sit on 12.10.2017.
 */
public interface ItemRepository {
    List<Item> findItemsById(int idCategory);
}
