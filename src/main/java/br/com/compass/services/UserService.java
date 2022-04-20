package br.com.compass.services;

import br.com.compass.domain.User;

public interface UserService {

    User findById(int id);
}
