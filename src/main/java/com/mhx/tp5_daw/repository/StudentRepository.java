package com.mhx.tp5_daw.repository;

import com.mhx.tp5_daw.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
