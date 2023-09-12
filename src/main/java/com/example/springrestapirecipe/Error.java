package com.example.springrestapirecipe;

import lombok.AllArgsConstructor;
import lombok.Builder;
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
@Builder
public class Error<T> {

    private int code;
    private T message;
    private ErrorType errorType = ErrorType.GENERAL;

    public Error(int code, T message) {
        this.code = code;
        this.message = message;
    }

}

enum ErrorType {
    GENERAL, VALIDATION
}
