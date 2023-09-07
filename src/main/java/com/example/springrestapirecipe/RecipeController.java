package com.example.springrestapirecipe;

import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Grzegorz Barwiński, brwngda
 * @project spring-restapi-recipe
 * @created 9/7/2023
 */
@RequestMapping("/recipes")
@RestController
class RecipeController {

    private final RecipeService recipeService;

    RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping
    List<Recipe> getRecipes(
            @RequestParam(required = false) String ingredients,
            @RequestParam(required = false) Complexity complexity,
            @RequestParam(required = false) Integer duration,
            @RequestParam(required = false) SortType sortType

    ) {
        return recipeService.getRecipes(ingredients, complexity, duration, sortType);
    }

    @GetMapping("/{id}")
    Recipe getRecipeById(@PathVariable Long id) {
        return recipeService.getRecipeById(id);
    }


    @PostMapping
    Recipe addRecipes(@RequestBody Recipe recipe) {
        return recipeService.addRecipe(recipe);
    }

    @DeleteMapping("/{id}")
    Recipe deleteRecipes(@PathVariable Long id) {
        return recipeService.deleteRecipe(id);
    }

    @PatchMapping("/{id}")
    Recipe updateRecipe(@PathVariable Long id, @RequestBody Recipe recipe) {
        return recipeService.updateRecipe(id, recipe);
    }

}
