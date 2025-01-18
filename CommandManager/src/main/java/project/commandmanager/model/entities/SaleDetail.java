package project.commandmanager.model.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class SaleDetail {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @ManyToOne
    private Sale sale;

    @ManyToOne
    private Product product;

    private int totalProducts;

    private String clarification;
}
