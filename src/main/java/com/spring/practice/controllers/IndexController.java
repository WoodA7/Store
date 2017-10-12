package com.spring.practice.controllers;


import com.spring.practice.model.Category;
import com.spring.practice.services.CategoryService;
import com.spring.practice.services.ItemService;
import com.spring.practice.services.model.ItemModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private CategoryService categoryService;
    @Autowired
    private ItemService itemService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(Model model) {
        List<Category> categoryList = categoryService.findAllCategories();
        model.addAttribute("categoryList", categoryList);
        return "index";
    }

    @RequestMapping(value = "/category", method = RequestMethod.POST)
    public String itemView(@RequestParam("id") String id, Model model) {
        List<ItemModel> items = itemService.findItemById(Integer.valueOf(id));
        model.addAttribute("itemList", items);
        return "itemView";
    }
}
