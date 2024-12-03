package project.commandmanager.model.persistence;

public class ProductCategoryRepository extends ARepository<ProductRepository, Long>{

    @Override
    protected Class<ProductRepository> getEntityClass() {
        return ProductRepository.class;
    }
}
