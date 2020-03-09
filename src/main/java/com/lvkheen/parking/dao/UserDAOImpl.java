package com.lvkheen.parking.dao;

import com.lvkheen.parking.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {
    @Autowired
    private SessionFactory sessionFactory;

    public List<User> getUsers() {
        Session session = sessionFactory.getCurrentSession();
        Query<User> query = session.createQuery("from User order by lastName", User.class);
        List<User> users = query.getResultList();
        return users;
    }

    public void saveUser(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(user);
    }

    public User getUser(int id) {
        Session session = sessionFactory.getCurrentSession();
        User user = session.get(User.class, id);
        return user;
    }

    public void deleteUser(int id) {
        Session session = sessionFactory.getCurrentSession();
        User user = session.get(User.class, id);
        session.delete(user);
    }

    public List<User> searchUser(String searchName) {
        Session session = sessionFactory.getCurrentSession();
        Query query = null;
        if (searchName != null && searchName.trim().length() > 0){
            query = session.createQuery("from User where lower(firstName) like :theName " +
                    "or lower(lastName) like :theName or lower(phone) like :theName or lower(car) like :theName" +
                    " or lower(car_number) like :theName or lower(location) like :theName order by lastName", User.class);
            query.setParameter("theName", "%" + searchName.toLowerCase() + "%");
        } else {
            query = session.createQuery("from User order by lastName", User.class);
        }
        List<User> users = query.getResultList();
        return users;
    }


}
