package project.commandmanager.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.List;

public abstract class ARepository<T, ID> {
    protected EntityManager em;

    public void setEm(EntityManager em){
        if(!this.em.isOpen() || this.em==null){
            this.em = em;
        }
    }

    public void create(T entity) {
        executeInsideTransaction(() -> em.persist(entity));
    }

    public void update(T entity) {
        executeInsideTransaction(() -> em.merge(entity));
    }

    public T getById(ID id) {
        return em.find(getEntityClass(), id);
    }

    public List<T> findAll() {
        String query = "select e from" + getEntityClass().getSimpleName() + "e";
        return em.createQuery(query, getEntityClass()).getResultList();
    }

    public void delete(T entity) {
        executeInsideTransaction(() -> em.remove(entity));
    }

    private void executeInsideTransaction(Runnable action) {
        EntityTransaction t = getTransaction();
        try {
            t.begin();
            action.run();
            t.commit();
        } catch (Exception e) {
            t.rollback();
        }
    }

    protected EntityTransaction getTransaction() {
        EntityTransaction t = em.getTransaction();
        if (!t.isActive()) {
            throw new IllegalStateException("There isn't active transactions to continue");
        }
        return t;
    }

    protected abstract Class<T> getEntityClass();
}
