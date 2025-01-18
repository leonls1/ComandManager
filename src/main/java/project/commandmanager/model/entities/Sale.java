package project.commandmanager.model.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import project.commandmanager.model.enums.PaymentType;
import project.commandmanager.model.enums.SaleState;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
public class Sale extends BasicEntity{
    private LocalDateTime saleDateTime;

    private BigDecimal totalAmount;

    private String observations;

    @OneToMany(mappedBy = "sale")
    private List<SaleDetail> details;

    @ManyToOne(cascade = CascadeType.MERGE)
    private User user;

    @ManyToOne(cascade = CascadeType.MERGE)
    private Client client;

    @Enumerated(value = EnumType.STRING)
    private PaymentType paymentType;

    @Enumerated(value = EnumType.STRING)
    private SaleState state = SaleState.ON_GOING;

}
