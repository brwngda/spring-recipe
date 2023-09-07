package com.example.springrestapirecipe;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author Grzegorz Barwiński, brwngda
 * @project spring-restapi-recipe
 * @created 9/7/2023
 */
@Component
class RecipeDataSetInitializer {

    private final RecipeRepository recipeRepository;

    RecipeDataSetInitializer(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @PostConstruct
    void init() {
        recipeRepository.saveAll(Arrays.asList(
                new Recipe("Pizza", "Best homemade pizza!", 120, 3, "water, active dry yeast, tomato sauce, flour, olive oil, salt", Complexity.STANDARD),
                new Recipe("Taco Soup", "Quick and easy taco soup", 90, 4, "beef, onion, tomato sauce", Complexity.EASY)
        ));
    }
}
