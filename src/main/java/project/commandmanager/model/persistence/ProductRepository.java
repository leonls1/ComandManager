package project.commandmanager.model.persistence;

import project.commandmanager.model.entities.Product;

public class ProductRepository extends ARepository<Product, Long> {
    @Override
    protected Class<Product> getEntityClass() {
        return Product.class;
    }
}
