package com.spring.practice.controllers;


import com.spring.practice.model.Category;
import com.spring.practice.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(Model model){
        List<Category> categoryList = categoryService.findAllCategories();
        model.addAttribute("categoryList", categoryList);
        return "index";
    }

}
