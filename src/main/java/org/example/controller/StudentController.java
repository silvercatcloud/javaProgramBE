package org.example.controller;

import org.example.pojo.Student;
import org.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping
    public void addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id) {
        return studentService.getStudentById(id);
    }

    @PutMapping
    public void updateStudent(@RequestBody Student student) {
        studentService.updateStudent(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable int id) {
        studentService.deleteStudent(id);
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }
    /**
     * 获取学生的总分
     * @param studentId 学生ID
     * @return 总分
     */
    @GetMapping("/{studentId}/totalScore")
    public Double getTotalScore(@PathVariable int studentId) {
        return studentService.getTotalScore(studentId);
    }

    /**
     * 获取学生的平均分
     * @param studentId 学生ID
     * @return 平均分
     */
    @GetMapping("/{studentId}/averageScore")
    public Double getAverageScore(@PathVariable int studentId) {
        return studentService.getAverageScore(studentId);
    }
}
