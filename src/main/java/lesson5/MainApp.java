package lesson5;

import lesson5.models.Student;
import lesson5.repositories.StudentRepository;
import lesson5.utils.HibernateUtils;

public class MainApp {
    private static final HibernateUtils hibernateUtils = new HibernateUtils();

    public static void main(String[] args) {
        try {
            hibernateUtils.init();
            StudentRepository studentRepository = new StudentRepository(hibernateUtils);
            for (int i = 7; i <= 1000; i++) {
                studentRepository.save(new Student("Name" + i, "Student" + i));
            }
            System.out.println(studentRepository.findAll());
            Student student999 = studentRepository.findOneById(999L).get();
            student999.setName("NewName999");
            studentRepository.save(student999);
            System.out.println(studentRepository.findOneById(999L));
        } finally {
            hibernateUtils.shutdown();
        }
    }
}
