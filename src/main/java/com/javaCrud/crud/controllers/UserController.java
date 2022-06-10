package com.javaCrud.crud.controllers;


import com.javaCrud.crud.business.models.entities.User;
import com.javaCrud.crud.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    IUserService userService;




    @PostMapping
    public void saveUser(@RequestBody User user){
        userService.saveUser(user);
    }

    @GetMapping("/{idUser}")
    public User getUser(@PathVariable("alunoId") String idUser){

        return userService.getUser(idUser);
    }

    @PutMapping("/{idUser}")
    public void updateUser(@PathVariable("idUser") String idUser, @RequestBody User user){
        userService.updateUser(user, idUser);
    }

    @DeleteMapping("/{idUser}")
    public void deleteUser(@PathVariable("idUser") String idUser){
        userService.deleteUser(idUser);
    }








}
