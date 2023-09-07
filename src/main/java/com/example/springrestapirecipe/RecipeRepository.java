package com.example.springrestapirecipe;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Grzegorz Barwiński, brwngda
 * @project spring-restapi-recipe
 * @created 9/7/2023
 */
public interface RecipeRepository extends JpaRepository<Recipe, Long> {

}

