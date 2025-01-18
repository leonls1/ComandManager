package project.commandmanager.model.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
public class Ingredient extends BasicEntity {
    private String name;

    private BigDecimal cost;

    private int actualStock;

    private int minStock;

    @ManyToOne
    private Recipe recipe;
}
