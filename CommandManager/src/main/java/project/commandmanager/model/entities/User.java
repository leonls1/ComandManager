package project.commandmanager.model.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import project.commandmanager.model.enums.Role;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "users")
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private String username;

    private String password;

    private boolean deleted;

    @Enumerated(value = EnumType.STRING)
    private Role rol;

    @OneToMany(mappedBy = "user")
    private List<Sale> sales;
}
