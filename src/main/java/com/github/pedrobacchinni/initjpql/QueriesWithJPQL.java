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

    private static void FirstQuery(EntityManager entityManager) {
        String jpqlList = "select u from User u";
        TypedQuery<User> typedQueryList = entityManager.createQuery(jpqlList, User.class);
        List<User> resultList = typedQueryList.getResultList();
        resultList.forEach(System.out::println);

        String jpqlSingle1 = "select u from User u where u.id = 1";
        TypedQuery<User> typedQuerySingle1 = entityManager.createQuery(jpqlSingle1, User.class);
        User user1 = typedQuerySingle1.getSingleResult();
        System.out.println(user1);

        String jpqlSingle2 = "select u from User u where u.id = 2";
        Query query = entityManager.createQuery(jpqlSingle2);
        User user2 = (User) query.getSingleResult();
        System.out.println(user2);
    }
}
