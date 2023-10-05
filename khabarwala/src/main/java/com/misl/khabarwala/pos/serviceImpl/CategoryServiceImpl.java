package com.misl.khabarwala.pos.serviceImpl;

import com.misl.khabarwala.pos.entity.Category;
import com.misl.khabarwala.pos.repository.CategoryRepository;
import com.misl.khabarwala.pos.repository.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepository categoryRepository;
    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Optional<Category> findById(Long id) {
        return Optional.ofNullable(categoryRepository.findById(id).orElseThrow(() -> new RuntimeException("Category Not Found")));
    }

    @Override
    public void updateEntity(Category category, Long id) {
        Category fetchedCategory = categoryRepository.findById(id).orElseThrow(RuntimeException::new);
        fetchedCategory.setName(category.getName());
    }

    @Override
    public void deleteEntity(Long id) {
        categoryRepository.deleteById(id);

    }

    @Override
    public Category saveEntity(Category category) {
        return categoryRepository.save(category);
    }
}
