    package com.mhx.tp5_daw.service;

    import com.mhx.tp5_daw.model.Student;
    import com.mhx.tp5_daw.repository.StudentRepository;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;

    import java.util.List;

    @Service
    public class StudentServices {

        @Autowired
        private StudentRepository studentRepository;
        public List<Student> getAllStudents() {
            return studentRepository.findAll();
        }
        public void saveStudent(Student student) {
            studentRepository.save(student);
        }
        public Student getStudentById(Long id) {
            return studentRepository.findById(id).orElse(null);
        }
        public void deleteStudent(Long id) {
            studentRepository.deleteById(id);
        }
    }
