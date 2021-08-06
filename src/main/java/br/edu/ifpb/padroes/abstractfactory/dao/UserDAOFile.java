package br.edu.ifpb.padroes.abstractfactory.dao;

import br.edu.ifpb.padroes.abstractfactory.entities.User;

import java.util.Collections;
import java.util.List;

public class UserDAOFile implements UserDAO {

    @Override
    public User findById(Object id) {
        return new User();
    }

    @Override
    public void save(User entidade) {
        System.out.println("Save user");
    }

    @Override
    public void delete(Object id) {
        System.out.println("Delete user");
    }

    @Override
    public List<User> findAll() {
        return Collections.singletonList(new User());
    }

}
