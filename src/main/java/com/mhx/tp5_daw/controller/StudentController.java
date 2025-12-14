package com.mhx.tp5_daw.controller;

import com.mhx.tp5_daw.model.Student;
import com.mhx.tp5_daw.service.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentServices studentService;

    @GetMapping
    public String listStudents(Model model) {
        List<Student> students = studentService.getAllStudents();
        model.addAttribute("students", students);
        return "student-list";
    }

    // Get a student by ID
    @GetMapping("/add")
    public String showAddForm(
            Model model
    ) {
        model.addAttribute("student", new Student());
        return "student-form";
    }

    // Create a new student
    @PostMapping("/save")
    public String saveStudent(@ModelAttribute Student student) {
        studentService.saveStudent(student);
        return "redirect:/students";
    }

    // Update an existing student
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Student student = studentService.getStudentById(id);
        model.addAttribute("student",student);
        return "student-form";
    }


    // Delete a student
    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);
        return "redirect:/students" ;
    }
}
