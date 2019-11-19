package com.github.pedrobacchinni.initjpql;

import com.github.pedrobacchinni.initjpql.model.User;

import javax.persistence.*;
import java.util.List;

public class QueriesWithJPQL {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Users-PU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        FirstQuery(entityManager);

        entityManager.close();
        entityManagerFactory.close();
    }

    private static void FirstQuery(EntityManager entityManager)
    {
        TypedQuery<User> typedQuery = entityManager.createQuery("select u from User u", User.class);
        List<User> resultList = typedQuery.getResultList();
        resultList.forEach(System.out::println);
    }
}
