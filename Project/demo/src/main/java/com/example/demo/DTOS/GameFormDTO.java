package com.example.demo.DTOS;

import com.example.demo.Model.Category;
import com.example.demo.Model.User;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GameFormDTO {
    private String title;

    private String description;

    private Integer storage;

    private String img_url;

    private BigDecimal price;

    private Integer category_id;

    private List<Category> categories = new ArrayList<Category>();
}
