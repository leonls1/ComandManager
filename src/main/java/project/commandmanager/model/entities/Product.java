package project.commandmanager.model.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import project.commandmanager.model.enums.ProductCategory;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@Entity
public class Product extends BasicEntity{
    @Column(unique = true)
    private String name;

    private BigDecimal price;

    private BigDecimal cost;

    private double profitPercentage;

    private int actualStock;

    private int minStock;

    @OneToOne
    private Recipe recipe;

    @Enumerated(value = EnumType.STRING)
    private ProductCategory category;

    @OneToMany(mappedBy = "recipe")
    private List<SaleDetail> details;
}
