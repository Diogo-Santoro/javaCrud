package com.javaCrud.crud.services;


import com.javaCrud.crud.business.models.entities.User;

public interface IUserService {

    void saveUser(User user);

    void updateUser(User user, String idUser);

    User getUser(String idUser);

    void deleteUser(String idIuser);
}
