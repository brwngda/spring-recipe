package com.example.springrestapirecipe;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Grzegorz Barwiński, brwngda
 * @project spring-restapi-recipe
 * @created 9/7/2023
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Error {

    private int code;
    private String message;
}
