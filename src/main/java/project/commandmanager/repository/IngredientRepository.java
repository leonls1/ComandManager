package project.commandmanager.repository;

import jakarta.persistence.EntityManager;
import project.commandmanager.model.entities.Ingredient;

public class IngredientRepository extends GRepository<Ingredient, Long> {

    public IngredientRepository(EntityManager em) {
        super(em, Ingredient.class);
    }
}
