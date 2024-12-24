package org.example.service;

import org.example.mapper.ScoreMapper;
import org.example.mapper.StudentMapper;
import org.example.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private ScoreMapper scoreMapper;


    public void addStudent(Student student) {
        studentMapper.addStudent(student);
    }

    public Student getStudentById(int id) {
        return studentMapper.getStudentById(id);
    }

    public void updateStudent(Student student) {
        studentMapper.updateStudent(student);
    }

    public void deleteStudent(int id) {
        studentMapper.deleteStudent(id);
    }

    public List<Student> getAllStudents() {
        return studentMapper.getAllStudents();
    }
    /**
     * 获取学生的总分
     * @param studentId 学生ID
     * @return 总分
     */
    public Double getTotalScore(int studentId) {
        return scoreMapper.getTotalScoreByStudentId(studentId);
    }

    /**
     * 获取学生的平均分
     * @param studentId 学生ID
     * @return 平均分
     */
    public Double getAverageScore(int studentId) {
        return scoreMapper.getAverageScoreByStudentId(studentId);
    }
}
