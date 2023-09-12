package com.example.springrestapirecipe;

/**
 * @author Grzegorz Barwiński, brwngda
 * @project spring-restapi-recipe
 * @created 9/12/2023
 */
public class RecipeAlreadyExistsException extends RuntimeException {

    public RecipeAlreadyExistsException(String recipeName) {
        super(String.format("Recipe %s already exists!", recipeName));
    }
}
