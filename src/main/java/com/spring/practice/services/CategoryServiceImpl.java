package com.spring.practice.services;

import com.spring.practice.model.Category;
import com.spring.practice.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sit on 10.10.2017.
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> findAllCategories() {
        List<Category> categoryList = categoryRepository.findCategories();

        if (categoryList.isEmpty())
            categoryList.add(new Category(0, "default"));

        return categoryList;
    }
}
