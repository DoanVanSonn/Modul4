package service;

import bean.User;

import java.util.List;

public interface IUserService<E> {
    List<E> findAll();
    void save(E e);
    void deleteById(int id);
    void findById(int id);
}
