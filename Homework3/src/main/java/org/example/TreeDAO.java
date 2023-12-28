package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import java.util.List;

public class TreeDAO {
    private final SessionFactory sessionFactory;

    public TreeDAO() {
        this.sessionFactory = HibernateUtil.getSessionFactory();
    }

    public List<Tree> readTrees() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("FROM Tree", Tree.class).list();
        }
    }

    public int getTotalLeaves() {
        // Логика подсчета общего числа листьев с использованием Hibernate
        // ...
        return 0;
    }

    // Другие методы работы с деревьями через Hibernate
    // ...
}
