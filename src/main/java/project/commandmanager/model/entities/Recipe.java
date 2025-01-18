package project.commandmanager.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Recipe extends BasicEntity{

    private double ingredientQuantity;

    private String clarifications;

    @OneToMany(mappedBy = "recipe")
    private List<Ingredient> ingredients;

    @OneToOne(mappedBy = "recipe")
    private Product product;


}
