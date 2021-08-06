package br.edu.ifpb.padroes.abstractfactory.services;

import br.edu.ifpb.padroes.abstractfactory.dao.DAO;
import br.edu.ifpb.padroes.abstractfactory.dao.ProductDAODB;
import br.edu.ifpb.padroes.abstractfactory.entities.Product;

import java.util.Optional;

public abstract class ProductService extends AbstractService<Product> {

    private DAO<Product> dao;

    // Abstract Factory!!
    @Override
    public abstract DAO<Product> getDAO();

    public boolean checkIfItIsAvailable(Long id) {
        return Optional.ofNullable(getDAO().findById(id)).isPresent();
    }

}
