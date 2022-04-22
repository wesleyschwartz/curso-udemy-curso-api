package br.com.compass.services;

import br.com.compass.domain.User;

import java.util.List;

public interface UserService {

    User findById(int id);

    List<User> findAll();
}
