package ramin.spring.recipeapp.springrecipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ramin.spring.recipeapp.springrecipeapp.domain.Category;
import ramin.spring.recipeapp.springrecipeapp.domain.Recipe;

import java.util.Optional;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
    Optional<Category> findByDescription(String description);
}
