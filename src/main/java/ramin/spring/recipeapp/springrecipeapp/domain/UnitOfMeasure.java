package ramin.spring.recipeapp.springrecipeapp.domain;

import ramin.spring.recipeapp.springrecipeapp.enums.MeasureUnits;

import javax.persistence.*;

@Entity
public class UnitOfMeasure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private MeasureUnits unitOfMeasure;

    @OneToOne
    private Ingredient ingredient;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MeasureUnits getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(MeasureUnits unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }
}
