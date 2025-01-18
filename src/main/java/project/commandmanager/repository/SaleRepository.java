package project.commandmanager.repository;

import jakarta.persistence.EntityManager;
import project.commandmanager.model.entities.Sale;

public class SaleRepository extends GRepository<Sale, Long> {
    public SaleRepository(EntityManager em) {
        super(em, Sale.class);
    }
}
