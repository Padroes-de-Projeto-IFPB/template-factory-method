package br.edu.ifpb.padroes.abstractfactory.dao;

import br.edu.ifpb.padroes.abstractfactory.entities.Product;

import java.util.List;

public interface ProductDAO extends DAO<Product> {

    @Override
    public Product findById(Object id);

    @Override
    public void save(Product entidade);

    @Override
    public void delete(Object id);

    @Override
    public List<Product> findAll();

}
