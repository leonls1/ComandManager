package project.commandmanager.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Client extends BasicEntity {

    private String clientName;

    @ManyToOne
    private Address address;

    @OneToMany(mappedBy = "client")
    private List<Sale> sales;
}
