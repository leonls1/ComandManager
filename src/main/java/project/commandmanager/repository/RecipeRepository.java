package project.commandmanager.repository;

import jakarta.persistence.EntityManager;
import project.commandmanager.model.entities.Recipe;

public class RecipeRepository extends GRepository<Recipe, Long> {
    public RecipeRepository(EntityManager em) {
        super(em, Recipe.class);
    }
}
