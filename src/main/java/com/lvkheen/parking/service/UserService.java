package com.lvkheen.parking.service;

import com.lvkheen.parking.entity.User;

import java.util.List;

public interface UserService {

    List<User> getUsers();

    void saveUser(User user);

    User getUser(int id);

    void deleteUser(int id);

    List<User> searchUser(String searchName);
}
