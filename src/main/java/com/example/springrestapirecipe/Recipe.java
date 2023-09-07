package com.example.springrestapirecipe;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

/**
 * @author Grzegorz Barwiński, brwngda
 * @project spring-restapi-recipe
 * @created 9/7/2023
 */

@Entity
@Data
public class Recipe {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String description;
    private int duration;
    private int numberOfPeople;
    private String ingredients;
    private Complexity complexity;

    public Recipe() {
    }
}
enum Complexity {
    EASY, STANDARD, HARD
}
