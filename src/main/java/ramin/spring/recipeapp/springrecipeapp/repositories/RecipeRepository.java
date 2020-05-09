package ramin.spring.recipeapp.springrecipeapp.repositories;

import ramin.spring.recipeapp.springrecipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;


public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
