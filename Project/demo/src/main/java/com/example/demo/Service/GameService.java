package com.example.demo.Service;

import com.example.demo.DTOS.CategoryFormDTO;
import com.example.demo.DTOS.GameFormDTO;
import com.example.demo.Model.Category;
import com.example.demo.Model.Game;
import com.example.demo.Repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    public void createGame(GameFormDTO gameFormDTO) {
//         validations
        String gameName = gameFormDTO.getTitle();

//        if (categoryName == null || categoryName.trim().isEmpty()) {
//            throw new IllegalArgumentException("Category name cannot be null or empty");
//
//        }
//
//        if (existsByName(categoryFormDTO.getName())) {
//            throw new IllegalStateException("Category with this name already exists");
//        }
//
//        Category category = new Category();
//        category.setName(categoryFormDTO.getName());
//
//        return game.save(category);
    }
}
