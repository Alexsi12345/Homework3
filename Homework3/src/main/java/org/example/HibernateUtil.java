package org.example;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
    private static SessionFactory sessionFactory;

    static {
        try {
            Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfg.xml");

            StandardServiceRegistryBuilder registryBuilder =
                    new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());

            sessionFactory = configuration.buildSessionFactory(registryBuilder.build());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
