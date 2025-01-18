package project.commandmanager.repository;

import jakarta.persistence.EntityManager;
import project.commandmanager.model.entities.User;

public class UserRepository extends GRepository<User, Long> {

    public UserRepository(EntityManager em) {
        super(em, User.class);
    }
}
