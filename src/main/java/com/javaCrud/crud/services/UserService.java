package com.javaCrud.crud.services;


import com.javaCrud.crud.business.models.entities.User;
import com.javaCrud.crud.business.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Service;



@Service
public class UserService implements IUserService{

    @Autowired
    IUserRepository userRepository;

    @Override
    public void saveUser(User user) {

        userRepository.save(user);

    }

    @Override
    public void updateUser(User user, String idUser) {

        User lastUser = userRepository.findById(idUser).orElse(null);
        lastUser.setLastName(user.getLastName());
        lastUser.setName(user.getName());
        userRepository.save(lastUser);

    }

    @Override
    public User getUser(String idUser) {
        User user = userRepository.findById(idUser).orElse(null);
        return user;
    }

    @Override
    public void deleteUser(String idUser) {
        userRepository.deleteById(idUser);
    }
}
