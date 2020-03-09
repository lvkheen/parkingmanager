package com.lvkheen.parking.dao;

import com.lvkheen.parking.entity.User;

import java.util.List;

public interface UserDAO {

    List<User> getUsers();

    void saveUser(User user);

    User getUser(int id);

    void deleteUser(int id);

    List<User> searchUser(String searchName);
}
