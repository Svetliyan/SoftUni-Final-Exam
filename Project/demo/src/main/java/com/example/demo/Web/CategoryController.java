package com.example.demo.Web;

import com.example.demo.DTOS.CategoryFormDTO;
import com.example.demo.Model.Category;
import com.example.demo.Repositories.CategoryRepository;
import com.example.demo.Service.CategoryService;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/all")
    public ResponseEntity<List<Category>> getAll(){
        List<Category> categories = categoryService.getAllCategories();

        return ResponseEntity.ok(categories);
    }

        @PostMapping("/add")
        public ResponseEntity<Category> createCategory(@RequestBody CategoryFormDTO categoryFormDTO) {
            Category category = categoryService.createCategory(categoryFormDTO);

            return ResponseEntity.ok(category);
        }
}
