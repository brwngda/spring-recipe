package com.example.springrestapirecipe;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

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

    @NotNull
    @NotBlank
    @Size(min = 2, max = 30)

    private String name;
    @NotNull
    @NotBlank
    @Size(min = 10, max = 100)
    private String description;
    @NotNull
    @Min(1)
    private Integer duration;
    @Min(1)
    @Max(20)

    private Integer numberOfPeople;
    private String ingredients;
    @NotNull
    private Complexity complexity;

    public Recipe(String name, String description, int duration, int numberOfPeople, String ingredients, Complexity complexity) {
        this.name = name;
        this.description = description;
        this.duration = duration;
        this.numberOfPeople = numberOfPeople;
        this.ingredients = ingredients;
        this.complexity = complexity;
    }

}
enum Complexity {
    EASY, STANDARD, HARD
}
