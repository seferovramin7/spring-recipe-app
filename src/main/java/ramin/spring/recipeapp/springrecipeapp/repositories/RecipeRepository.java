package ramin.spring.recipeapp.springrecipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ramin.spring.recipeapp.springrecipeapp.domain.Recipe;

@Repository
public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
