package com.example.springrestapirecipe;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Grzegorz Barwiński, brwngda
 * @project spring-restapi-recipe
 * @created 9/7/2023
 */
@Service
class RecipeService {

        private final RecipeRepository recipeRepository;

        RecipeService(RecipeRepository recipeRepository) {
            this.recipeRepository = recipeRepository;
        }

        List<Recipe> getRecipes() {
            return recipeRepository.findAll();
        }

        Recipe addRecipe(Recipe recipe) {
            return recipeRepository.save(recipe);
        }

        Recipe deleteRecipe(Long id) {
            Recipe recipeFromDb = recipeRepository.findById(id)
                    .orElseThrow();
            recipeRepository.delete(recipeFromDb);
            return recipeFromDb;
        }
    }
