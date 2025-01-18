package project.commandmanager.model.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Entity
@Table(name = "users")
public class User extends BasicEntity {
    private String name;

    private String lastName;

    private String username;

    private String password;

    @ManyToOne(cascade = CascadeType.MERGE)
    private Role role;

    @OneToMany(mappedBy = "user")
    private List<Sale> sales;
}
