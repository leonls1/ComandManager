package project.commandmanager.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import lombok.Getter;

import java.util.List;
import lombok.Setter;
import project.commandmanager.model.entities.BasicEntity;

public abstract class GRepository<E extends BasicEntity, ID> {

    @Getter@Setter
    private EntityManager em;
    private final Class<E> entityClass;

    public GRepository(EntityManager em, Class<E> entityClass) {
        this.em = em;
        this.entityClass = entityClass;
    }

    public void create(E entity) {
        EntityTransaction transaction = null;
        try {
            transaction = em.getTransaction();
            transaction.begin();
            if (entity.getId() == null || em.find(entity.getClass(), entity.getId()) == null) {
                // Entity does not exist, persist it
                em.persist(entity);
            } else {
                // Entity exists, merge it
                em.merge(entity);
            }
            transaction.commit();

        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            throw new RuntimeException("Error creating entity:" + entity, e);

        }
    }

    public E findById(ID id) {
        try {
            return em.find(entityClass, id);
        } catch (Exception e) {
            System.out.println("An error happen:" + e.getMessage());
            return null;
        }

    }

    public List<E> findAll() {
        try {
            String query = "Select e FROM " + entityClass.getSimpleName() + " e";
            return em.createQuery(query, entityClass).getResultList();
        } catch (Exception e) {
            System.out.println("An error happen:" + e.getMessage());
            return null;
        }
    }

    public List<E> findAllNotDeleted() {
        try {
            String query = "Select e FROM " + entityClass.getSimpleName() + " e WHERE e.isDeleted = false";
            return em.createQuery(query, entityClass).getResultList();
        } catch (Exception e) {
            System.out.println("An error happen:" + e.getMessage());
            return null;
        }
    }

    public void update(E entity) {
        EntityTransaction transaction = null;
        try {
            transaction = em.getTransaction();
            transaction.begin();
            em.merge(entity);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                System.out.println("error merging entity :" + e.toString());
                try {
                    transaction.rollback();
                } catch (Exception ex) {
                    System.out.println("error rolliong back");
                }

            }
            throw new RuntimeException("Error updating entity:" + entity, e);

        }
    }

    public void delete(E entity) {
        EntityTransaction transaction = null;
        try {

            transaction = em.getTransaction();
            transaction.begin();
            em.remove(entity);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            throw new RuntimeException("Error removing entity:" + entity, e);

        }
    }

    public void softDelete(E entity) {
        EntityTransaction transaction = null;
        try {
            transaction = em.getTransaction();
            transaction.begin();
            entity.setDeleted(true);
            em.merge(entity);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            throw new RuntimeException("Error removing entity:" + entity, e);

        }
    }
}
