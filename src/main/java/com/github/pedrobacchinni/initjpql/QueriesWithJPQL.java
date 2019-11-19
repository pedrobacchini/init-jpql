package com.github.pedrobacchinni.initjpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class QueriesWithJPQL {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Users-PU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        //Queries here

        entityManager.close();
        entityManagerFactory.close();
    }
}
