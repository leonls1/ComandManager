package project.commandmanager.repository;

import jakarta.persistence.EntityManager;
import project.commandmanager.model.entities.Ingredient;

public class IngredientRepository extends GRepository<Ingredient, Long> {

    public IngredientRepository(EntityManager em, Class<Ingredient> entityClass) {
        super(em, Ingredient.class);
    }
}
