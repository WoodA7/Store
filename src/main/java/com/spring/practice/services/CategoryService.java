package com.spring.practice.services;

import com.spring.practice.model.Category;

import java.util.List;

/**
 * Created by Sit on 10.10.2017.
 */
public interface CategoryService {

    List<Category> findAllCategories();
}
