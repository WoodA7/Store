package com.spring.practice.repository;

import com.spring.practice.model.Category;

import java.util.List;

/**
 * Created by Sit on 10.10.2017.
 */
public interface CategoryRepository {
    List<Category> findCategories();
}
