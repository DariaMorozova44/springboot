package ru.javamentor.springmvc.service;

import ru.javamentor.springmvc.model.User;

import java.util.List;

public interface UserService {


    User getUserById(long id);

    void addUser(User user);


    void deleteUser(Long id);

    void editUser(User user);

    List<User> getAllUsers();


}