package lesson5.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class HibernateUtils {
    private SessionFactory sessionFactory;

    public void init() {
        sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();
        try (Session session = sessionFactory.getCurrentSession()) {
            String sql = Files.lines(Paths.get("full.sql")).collect(Collectors.joining(" "));
            session.beginTransaction();
            session.createNativeQuery(sql).executeUpdate();
            session.getTransaction().commit();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    public void shutdown() {
        if (sessionFactory != null) {
            sessionFactory.close();
        }
    }
}
