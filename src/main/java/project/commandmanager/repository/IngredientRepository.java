package project.commandmanager.repository;

import project.commandmanager.model.entities.Ingredient;

public class IngredientRepository extends ARepository<Ingredient, Long> {
    @Override
    protected Class<Ingredient> getEntityClass() {
        return Ingredient.class;
    }
}
