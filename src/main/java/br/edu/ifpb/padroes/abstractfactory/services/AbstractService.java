package br.edu.ifpb.padroes.abstractfactory.services;

import br.edu.ifpb.padroes.abstractfactory.dao.DAO;

// Abstract Factory
public abstract class AbstractService<E> {

    private FileGenerator generator;

    // Factory Method
    public abstract DAO<E> getDAO();

    public void saveEntityInFile(Object id, String fileName) {
        E entity = getDAO().findById(id);
        generator.storeClassAsFile(fileName, entity);
    }

}
