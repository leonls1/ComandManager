package project.commandmanager.repository;

import jakarta.persistence.EntityManager;
import project.commandmanager.model.entities.SaleDetail;

public class SaleDetailRepository extends GRepository<SaleDetail, Long> {
    public SaleDetailRepository(EntityManager em) {
        super(em, SaleDetail.class);
    }
}
