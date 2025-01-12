package com.example.demo.Model;

import jakarta.persistence.*;

import org.antlr.v4.runtime.misc.NotNull;
import lombok.*;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @NotNull
    private String name;

    @OneToMany
    @JoinTable(name = "category_games",
            joinColumns = @JoinColumn(name = "category_id"),
            inverseJoinColumns = @JoinColumn(name = "game_id"))
    private List<Game> games;
}
