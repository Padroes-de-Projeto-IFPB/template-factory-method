package br.edu.ifpb.padroes.abstractfactory.dao;

import br.edu.ifpb.padroes.abstractfactory.entities.User;

import java.util.List;

public interface UserDAO extends DAO<User> {

    @Override
    public User findById(Object id);

    @Override
    public void save(User entidade);

    @Override
    public void delete(Object id);

    @Override
    public List<User> findAll();

}
