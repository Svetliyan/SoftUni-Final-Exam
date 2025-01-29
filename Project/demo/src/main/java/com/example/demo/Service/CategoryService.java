package com.example.demo.Service;

import com.example.demo.DTOS.CategoryFormDTO;
import com.example.demo.Model.Category;
import com.example.demo.Repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;
    
//    @Autowired
//    public CategoryService(CategoryRepository categoryRepository) {
//        this.categoryRepository = categoryRepository;
//    }

    public Category createCategory(CategoryFormDTO categoryFormDTO) {
       // validations
        String categoryName = categoryFormDTO.getName();

        if (categoryName == null || categoryName.trim().isEmpty()) {
            throw new IllegalArgumentException("Category name cannot be null or empty");

        }

        if (existsByName(categoryFormDTO.getName())) {
            throw new IllegalStateException("Category with this name already exists");
        }

        Category category = new Category();
        category.setName(categoryFormDTO.getName());

        return categoryRepository.save(category);
    }

    public Boolean existsByName(String name) {
        return categoryRepository.existsByName(name);
    }

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }
}
