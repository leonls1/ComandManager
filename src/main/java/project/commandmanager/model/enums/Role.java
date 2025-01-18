package project.commandmanager.model.enums;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import project.commandmanager.model.entities.BasicEntity;
import project.commandmanager.model.entities.User;

import java.util.List;


public enum Role  {
    ADMIN,
    USER,
    CASHIER
}
