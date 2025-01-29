package com.example.demo.Extensions;

import com.example.demo.DTOS.CategoryFormDTO;
import com.example.demo.Service.CategoryService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Array;
import java.util.Arrays;

@Configuration
public class DataSeeder {

    @Bean
    CommandLineRunner seedDatabase(CategoryService categoryService) {
        return args -> {
            String[] catNames = new String[]{"Action", "Adventure", "Sports", "Horror"};

            for (String name : catNames) {
                if (!categoryService.existsByName(name)) {
                    CategoryFormDTO dto = new CategoryFormDTO();
                    dto.setName(name);
                    categoryService.createCategory(dto);
                    System.out.println("Inserted category " + name);
                }else{
                    System.out.println("Category already exits " + name);
                }
            }

            System.out.println("Database seeding was completed");
        };
    }
}
