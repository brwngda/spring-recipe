package com.example.springrestapirecipe;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Grzegorz Barwiński, brwngda
 * @project spring-restapi-recipe
 * @created 9/7/2023
 */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Recipe {

    @Id
    @GeneratedValue
    private Long id;

    @NotNull(groups = AddRecipe.class)
    @NotBlank(groups = {AddRecipe.class})
    @Size(min = 2, max = 30, groups = {AddRecipe.class, UpdateRecipe.class})

    private String name;
    @NotNull(groups = AddRecipe.class)
    @NotBlank(groups = {AddRecipe.class})
    @Size(min = 10, max = 100, groups = {AddRecipe.class, UpdateRecipe.class})
    private String description;
    @NotNull(groups = AddRecipe.class)
    @Min(value = 1, groups = {AddRecipe.class, UpdateRecipe.class})
    private Integer duration;
    @Min(value = 1, groups = {AddRecipe.class, UpdateRecipe.class})
    @Max(value = 20, groups = {AddRecipe.class, UpdateRecipe.class})
    private Integer numberOfPeople;
    private String ingredients;
    @NotNull(groups = AddRecipe.class)
    private Complexity complexity;
}

enum Complexity {
    EASY, STANDARD, HARD
}

interface AddRecipe {
}

interface UpdateRecipe {
}
