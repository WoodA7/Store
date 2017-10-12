package com.spring.practice.services;

import com.spring.practice.model.Category;

import java.util.List;

public interface CategoryService {

    List<Category> findAllCategories();
}
