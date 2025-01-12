package com.example.demo.Model;

import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.UUID;

@Entity
@Table(name = "games")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(unique = true, nullable = false, length = 50)
    private String title;

    @Column(length = 500)
    private String description;

    @Column(nullable = false)
    private int storage;

    @Column(nullable = false)
    private String img_url;

    @Column(nullable = false)
    private double price;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private Category category;
}
