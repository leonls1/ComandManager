package project.commandmanager.model.persistence;

import project.commandmanager.model.entities.Sale;

public class SaleRepository extends ARepository<Sale, Long>{
    @Override
    protected Class<Sale> getEntityClass() {
        return Sale.class;
    }
}
