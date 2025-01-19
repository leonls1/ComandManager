package project.commandmanager.repository;

import jakarta.persistence.EntityManager;
import project.commandmanager.model.entities.Client;

public class ClientRepository extends GRepository<Client, Long>{

    public ClientRepository(EntityManager em) {
        super(em, Client.class);
    }
}
