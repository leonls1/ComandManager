package project.commandmanager.model.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Product {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String name;

    private String description;

    private float price;

    private float profit;

    @ManyToOne
    private ProductCategory category;

    @ManyToMany
    private List<Ingredient> ingredients;

    @OneToMany(mappedBy = "product")
    private List<SaleDetail> details;
}
