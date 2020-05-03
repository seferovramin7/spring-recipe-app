package ramin.spring.recipeapp.springrecipeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ramin.spring.recipeapp.springrecipeapp.domain.Category;
import ramin.spring.recipeapp.springrecipeapp.domain.UnitOfMeasure;
import ramin.spring.recipeapp.springrecipeapp.repositories.CategoryRepository;
import ramin.spring.recipeapp.springrecipeapp.repositories.UnitOfMeasureRepository;

import java.util.Optional;

@Controller
public class IndexController {

    private final CategoryRepository categoryRepository;
    private final UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"","/","/index","/index.html"})
    public String getIndexPAge(){
        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> optionalUnitOfMeasure = unitOfMeasureRepository.findByDescription("Tablespoon");

        System.out.println(categoryOptional.get().getDescription() + " " + optionalUnitOfMeasure.get().getDescription() );

        return "index";
    }
}