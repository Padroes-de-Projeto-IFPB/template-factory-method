package br.edu.ifpb.padroes.abstractfactory.services;

import br.edu.ifpb.padroes.abstractfactory.dao.*;
import br.edu.ifpb.padroes.abstractfactory.entities.User;

import java.util.Optional;

public class UserService extends AbstractService<User> {

    private DAO<User> dao;

    // Factory Method
    @Override
    public DAO<User> getDAO() {
        if (dao == null) {
            dao = new UserDAODB();
        }
        return dao;
    }

    public boolean authenticate(Long id, String password) {
        return Optional.ofNullable(getDAO().findById(id))
                .map(user -> user.getPassword().equals(password))
                .orElse(false);
    }

}
