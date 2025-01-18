package project.commandmanager.repository;

public class ProductCategoryRepository extends ARepository<ProductRepository, Long>{

    @Override
    protected Class<ProductRepository> getEntityClass() {
        return ProductRepository.class;
    }
}
