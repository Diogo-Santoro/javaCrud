package com.javaCrud.crud.business.repositories;


import com.javaCrud.crud.business.models.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, String> {

}
