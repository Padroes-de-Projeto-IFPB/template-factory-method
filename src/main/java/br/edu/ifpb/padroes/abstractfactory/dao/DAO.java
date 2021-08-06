package br.edu.ifpb.padroes.abstractfactory.dao;

import java.util.List;

// Dependency
public interface DAO<E> {
    public E findById(Object id);
    public void save(E entidade);
    public void delete(Object id);
    public List<E> findAll();
}
