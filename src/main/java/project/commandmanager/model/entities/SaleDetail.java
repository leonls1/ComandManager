package project.commandmanager.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
public class SaleDetail extends BasicEntity {
    private BigDecimal subTotal;

    private int totalItems;

    private String clarification;

    @ManyToOne
    private Product product;

    @ManyToOne
    private Sale sale;
}
