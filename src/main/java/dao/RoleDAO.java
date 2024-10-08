package dao;

import interfaces.iRole;
import jakarta.persistence.EntityManager;
import models.Role;
import models.User;

public class RoleDAO implements iRole {
    @Override
    public void save(Role role) {
        EntityManager em = EntityManagerAdmin.getInstance();
        em.getTransaction().begin();
        em.persist(role);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public Role getRole(int id) {
        EntityManager em = EntityManagerAdmin.getInstance();
        return em.find(Role.class, id);
    }

    @Override
    public void update(Role role) {
        EntityManager em = EntityManagerAdmin.getInstance();
        em.getTransaction().begin();
        em.merge(role);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void delete(Role role) {
        EntityManager em = EntityManagerAdmin.getInstance();
        em.getTransaction().begin();
        em.remove(role);
        em.getTransaction().commit();
        em.close();
    }
}
