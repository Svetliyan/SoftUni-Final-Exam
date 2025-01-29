package com.example.demo.Web;

import com.example.demo.DTOS.GameFormDTO;
import com.example.demo.Model.Category;
import com.example.demo.Service.CategoryService;
import com.example.demo.Service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class GameController {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private GameService gameService;

    @GetMapping("/games/add")
    public String loadGameForm(Model model) {
        model.addAttribute("gameDTO", new GameFormDTO());
        List<Category> categories = categoryService.getAllCategories();

        model.addAttribute("categories", categories);
        return "gameForm";
    }


    @PostMapping("/games/add")
    public String addGame(@ModelAttribute("gameDTO") GameFormDTO gameFormDto, Model model) {

        return "null";
    }

}


