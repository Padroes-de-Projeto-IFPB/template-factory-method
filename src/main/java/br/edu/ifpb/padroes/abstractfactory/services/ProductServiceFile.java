package br.edu.ifpb.padroes.abstractfactory.services;

import br.edu.ifpb.padroes.abstractfactory.dao.DAO;
import br.edu.ifpb.padroes.abstractfactory.dao.ProductDAOFile;
import br.edu.ifpb.padroes.abstractfactory.entities.Product;

public class ProductServiceFile extends ProductService {

    private DAO<Product> dao;

    @Override
    public DAO<Product> getDAO() {
        if (dao == null) {
            dao = new ProductDAOFile();
        }
        return dao;
    }

}
