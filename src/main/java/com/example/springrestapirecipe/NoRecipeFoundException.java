package com.example.springrestapirecipe;

/**
 * @author Grzegorz Barwiński, brwngda
 * @project spring-restapi-recipe
 * @created 9/7/2023
 */
public class NoRecipeFoundException extends RuntimeException {
    public NoRecipeFoundException(Long id) {
        super(String.format("Can't find recipe with id %d", id));
    }
}
