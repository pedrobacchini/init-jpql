package com.github.pedrobacchinni.initjpql;

import com.github.pedrobacchinni.initjpql.model.Domain;
import com.github.pedrobacchinni.initjpql.model.User;

import javax.persistence.*;
import java.util.List;

public class QueriesWithJPQL {

    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Users-PU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

//        FirstQuery(entityManager);
        choiceReturn(entityManager);

        entityManager.close();
        entityManagerFactory.close();
    }

    public static void choiceReturn(EntityManager entityManager) {
        String jpql = "select u.domain from User u where u.id = 3";
        TypedQuery<Domain> typedQueryList = entityManager.createQuery(jpql, Domain.class);
        Domain domain = typedQueryList.getSingleResult();
        System.out.println(domain);


        String jpqlName = "select u.name from User u";
        TypedQuery<String> typedQueryListName = entityManager.createQuery(jpqlName, String.class);
        List<String> names = typedQueryListName.getResultList();
        names.forEach(System.out::println);
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
