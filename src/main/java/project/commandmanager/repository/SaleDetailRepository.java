package project.commandmanager.repository;

import project.commandmanager.model.entities.SaleDetail;

public class SaleDetailRepository extends ARepository<SaleDetail, Long> {
    @Override
    protected Class<SaleDetail> getEntityClass() {
        return SaleDetail.class;
    }
}
