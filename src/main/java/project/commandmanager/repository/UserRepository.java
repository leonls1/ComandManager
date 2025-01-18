package project.commandmanager.repository;

import project.commandmanager.model.entities.User;

public class UserRepository extends ARepository<User, Long>{
    @Override
    protected Class<User> getEntityClass() {
        return User.class;
    }
}
