package project.commandmanager.repository;

import jakarta.persistence.EntityManager;
import project.commandmanager.model.entities.Product;

public class ProductRepository extends GRepository<Product, Long> {
    public ProductRepository(EntityManager em) {
        super(em, Product.class);
    }
}
