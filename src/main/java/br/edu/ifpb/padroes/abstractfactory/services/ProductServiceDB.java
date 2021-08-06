package br.edu.ifpb.padroes.abstractfactory.services;

import br.edu.ifpb.padroes.abstractfactory.dao.DAO;
import br.edu.ifpb.padroes.abstractfactory.dao.ProductDAODB;
import br.edu.ifpb.padroes.abstractfactory.entities.Product;

public class ProductServiceDB extends ProductService {

    private DAO<Product> dao;

    @Override
    public DAO<Product> getDAO() {
        if (dao == null) {
            dao = new ProductDAODB();
        }
        return dao;
    }

}
