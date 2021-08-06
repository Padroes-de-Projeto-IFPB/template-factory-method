package br.edu.ifpb.padroes.abstractfactory.dao;

import br.edu.ifpb.padroes.abstractfactory.entities.Product;

import java.util.Collections;
import java.util.List;

public class ProductDAODB implements ProductDAO {

    @Override
    public Product findById(Object id) {
        return new Product();
    }

    @Override
    public void save(Product entity) {
        System.out.println("Save product in database");
    }

    @Override
    public void delete(Object id) {
        System.out.println("Delete product from database");
    }

    @Override
    public List<Product> findAll() {
        return Collections.singletonList(new Product());
    }

}
