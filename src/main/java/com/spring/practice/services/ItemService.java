package com.spring.practice.services;

import com.spring.practice.services.model.ItemModel;

import java.util.List;

public interface ItemService {
    List<ItemModel> findItemById(int idCategory);
}
