package com.misl.khabarwala.pos.controller;

import com.misl.khabarwala.pos.entity.Category;
import com.misl.khabarwala.pos.repository.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("pos/")
public class CategoryController {

    CategoryService categoryService;

    @GetMapping
    public List<Category> getAllCategory(){
        return categoryService.findAll();
    }

    @GetMapping("{id}")
    public Optional<Category> getCategory(@PathVariable("id") Long id){
        return categoryService.findById(id);
    }

    @PutMapping("{id")
    public void updateCategory(@PathVariable("id") Long id, @RequestBody Category category){

        categoryService.updateEntity(category,id);
    }


}
