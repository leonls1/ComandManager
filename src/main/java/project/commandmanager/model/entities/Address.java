package project.commandmanager.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Address extends BasicEntity {
    private String street;
    private String streetNumber;
    private int departmentNumber;
    private String neighborhood;
    @OneToOne
    private Client client;
}
