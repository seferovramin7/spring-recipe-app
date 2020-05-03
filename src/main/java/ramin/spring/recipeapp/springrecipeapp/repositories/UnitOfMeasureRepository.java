package ramin.spring.recipeapp.springrecipeapp.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ramin.spring.recipeapp.springrecipeapp.domain.Category;
import ramin.spring.recipeapp.springrecipeapp.domain.UnitOfMeasure;

import java.util.Optional;

@Repository
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
    Optional<UnitOfMeasure> findByDescription(String description);
}
