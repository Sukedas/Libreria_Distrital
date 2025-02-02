package model.DAO;

import java.util.List;

/**
 * Interfaz genérica DAO para definir operaciones CRUD.
 * @param <T> Tipo de objeto
 */
public interface DAO<T> {
    void insert(T entity);
    void update(T entity);
    void delete(int id);
    T findById(int id);
    List<T> findAll();
}
