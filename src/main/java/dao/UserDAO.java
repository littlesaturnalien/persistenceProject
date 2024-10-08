package dao;

import interfaces.iUser;
import jakarta.persistence.EntityManager;
import models.User;

public class UserDAO implements iUser {
    @Override
    public void save(User user) {
        EntityManager em = EntityManagerAdmin.getInstance();
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public User getStudent(String username) {
        EntityManager em = EntityManagerAdmin.getInstance();
        return em.find(User.class, username);
    }

    @Override
    public void update(User user) {
        EntityManager em = EntityManagerAdmin.getInstance();
        em.getTransaction().begin();
        em.merge(user);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void delete(User user) {
        EntityManager em = EntityManagerAdmin.getInstance();
        em.getTransaction().begin();
        em.remove(user);
        em.getTransaction().commit();
        em.close();
    }
}
