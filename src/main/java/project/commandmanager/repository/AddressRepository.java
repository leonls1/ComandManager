package project.commandmanager.repository;

import jakarta.persistence.EntityManager;
import project.commandmanager.model.entities.Address;

public class AddressRepository extends GRepository<Address, Long> {
    public AddressRepository(EntityManager em) {
        super(em, Address.class);
    }
}
