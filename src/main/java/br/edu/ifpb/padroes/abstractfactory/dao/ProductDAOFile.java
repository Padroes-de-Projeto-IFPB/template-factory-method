package br.edu.ifpb.padroes.abstractfactory.dao;

import br.edu.ifpb.padroes.abstractfactory.entities.Product;

import java.util.Collections;
import java.util.List;

public class ProductDAOFile implements ProductDAO {

    @Override
    public Product findById(Object id) {
        return new Product();
    }

    @Override
    public void save(Product entidade) {
        System.out.println("Save product to file");
    }

    @Override
    public void delete(Object id) {
        System.out.println("Delete product from file");
    }

    @Override
    public List<Product> findAll() {
        return Collections.singletonList(new Product());
    }

}
