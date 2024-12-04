package project.commandmanager.model.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import project.commandmanager.model.enums.PaymentType;
import project.commandmanager.model.enums.StateSale;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Sale {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @Enumerated(value = EnumType.STRING)
    private StateSale saleState;

    private LocalDateTime saleDateTime;

    private BigDecimal totalAmount;

    private boolean deleted;

    private String address;

    private String clientName;

    private String observations;

    @OneToMany(mappedBy = "sale")
    private List<SaleDetail> details;

    @ManyToOne
    private User salesPerson;

    @Enumerated(value = EnumType.STRING)
    private PaymentType paymentType;






}
