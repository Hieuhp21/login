package com.hieunv.service;

import com.hieunv.entity.User;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class UserService {
    public User loginUsingJPA(String username, String password) {
        EntityManager em = Persistence.createEntityManagerFactory("login-pu").createEntityManager();
        User user = null;
        try {
            Query query = em.createQuery("select u from User u where u.username = :username and u.password = :password", User.class);
            query.setParameter("username", username);
            query.setParameter("password", password);
            List list = query.getResultList();
            if (!list.isEmpty()) {
                user = (User) list.get(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
        return user;
    }
}
