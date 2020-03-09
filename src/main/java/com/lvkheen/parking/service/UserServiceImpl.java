package com.lvkheen.parking.service;

import com.lvkheen.parking.dao.UserDAO;
import com.lvkheen.parking.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;

    @Transactional
    public List<User> getUsers() {
        return userDAO.getUsers();
    }

    @Transactional
    public void saveUser(User user) {
        userDAO.saveUser(user);
    }

    @Transactional
    public User getUser(int id) {
        return userDAO.getUser(id);
    }

    @Transactional
    public void deleteUser(int id) {
        userDAO.deleteUser(id);
    }

    @Transactional
    public List<User> searchUser(String searchName) {
        return userDAO.searchUser(searchName);
    }
}
