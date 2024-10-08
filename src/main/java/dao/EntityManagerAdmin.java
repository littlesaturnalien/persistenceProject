package dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EntityManagerAdmin {
    private static final String PERSISTENCE_UNIT_NAME = "db_jakarta";
    private static EntityManager instance;

    public EntityManagerAdmin() {
    }

    public static EntityManager getInstance() {
        if (instance == null || !instance.isOpen()) {
            EntityManagerFactory ef = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
            instance = ef.createEntityManager();
        }
        return instance;
    }
}
