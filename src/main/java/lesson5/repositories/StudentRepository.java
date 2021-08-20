package lesson5.repositories;

import org.hibernate.Session;
import lesson5.models.Student;
import lesson5.utils.HibernateUtils;

import java.util.List;
import java.util.Optional;


public class StudentRepository {
    private HibernateUtils hibernateUtils;

    public StudentRepository(HibernateUtils hibernateUtils) {
        this.hibernateUtils = hibernateUtils;
    }

    public List<Student> findAll() {
        try (Session session = hibernateUtils.getCurrentSession()) {
            session.beginTransaction();
            List<Student> Students = session.createQuery("from Student").getResultList();
            session.getTransaction().commit();
            return Students;
        }
    }

    public void save(Student Student) {
        try (Session session = hibernateUtils.getCurrentSession()) {
            session.beginTransaction();
            session.saveOrUpdate(Student);
            session.getTransaction().commit();
        }
    }

    public Optional<Student> findOneById(Long id) {
        try (Session session = hibernateUtils.getCurrentSession()) {
            session.beginTransaction();
            Optional<Student> Student = Optional.ofNullable(session.get(Student.class, id));
            session.getTransaction().commit();
            return Student;
        }
    }

    public void deleteById(Long id) {
        try (Session session = hibernateUtils.getCurrentSession()) {
            session.beginTransaction();
            session.createQuery("delete from Student p where p.id = " + id).executeUpdate();
            session.getTransaction().commit();
        }
    }
}
