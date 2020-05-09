package ramin.spring.recipeapp.springrecipeapp.services;

import ramin.spring.recipeapp.springrecipeapp.domain.Recipe;

import java.util.Set;


public interface RecipeService {

    Set<Recipe> getRecipes();
}
