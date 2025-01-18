package project.commandmanager.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Role extends BasicEntity{
    private String description;

    @OneToMany(mappedBy = "role")
    private List<User> user;
}
