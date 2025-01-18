package project.commandmanager.repository;

import project.commandmanager.model.entities.Sale;

public class SaleRepository extends ARepository<Sale, Long>{
    @Override
    protected Class<Sale> getEntityClass() {
        return Sale.class;
    }
}
