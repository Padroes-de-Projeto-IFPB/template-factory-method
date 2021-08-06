package br.edu.ifpb.padroes.abstractfactory;

import br.edu.ifpb.padroes.abstractfactory.services.ProductService;
import br.edu.ifpb.padroes.abstractfactory.services.ProductServiceDB;
import br.edu.ifpb.padroes.abstractfactory.services.ProductServiceFile;
import br.edu.ifpb.padroes.abstractfactory.services.UserService;

public class Main {

    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.authenticate(1L, "123");
        userService.saveEntityInFile(1L, "usuario.csv");

        ProductService productService = new ProductServiceFile();
        productService.saveEntityInFile(2L, "product.csv");

        ProductService productServiceDB = new ProductServiceDB();
        productServiceDB.saveEntityInFile(2L, "product.csv");

    }

}
