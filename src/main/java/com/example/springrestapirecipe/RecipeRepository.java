package com.example.springrestapirecipe;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author Grzegorz Barwiński, brwngda
 * @project spring-restapi-recipe
 * @created 9/7/2023
 */
public interface RecipeRepository extends JpaRepository<Recipe, Long> {
    List<Recipe> findAllByIngredientsContains(String ingredients);

    List<Recipe> findAllByComplexity(Complexity complexity);

    List<Recipe> findAllByDuration(int duration);


}

