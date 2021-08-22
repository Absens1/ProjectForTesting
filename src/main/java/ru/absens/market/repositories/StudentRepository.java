package ru.absens.market.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.absens.market.models.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}