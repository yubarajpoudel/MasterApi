package com.example.masterapi.controller;

import com.example.masterapi.domain.Category;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class ShayariController {
    @GetMapping(value = "category")
    public @ResponseBody Category getCategory() {
        Category category = new Category();
        category.setTitle("test");
        return category;
    }
}
