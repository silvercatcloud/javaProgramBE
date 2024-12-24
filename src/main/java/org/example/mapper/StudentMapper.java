package org.example.mapper;

import org.apache.ibatis.annotations.*;
import org.example.pojo.Student;

import java.util.List;

@Mapper
public interface StudentMapper {
    @Insert("INSERT INTO Student(id, name, gender, age, major) VALUES(#{id}, #{name}, #{gender}, #{age}, #{major})")
    void addStudent(Student student);

    @Select("SELECT * FROM Student WHERE id = #{id}")
    Student getStudentById(int id);

    @Update("UPDATE Student SET name=#{name}, gender=#{gender}, age=#{age}, major=#{major} WHERE id=#{id}")
    void updateStudent(Student student);

    @Delete("DELETE FROM Student WHERE id = #{id}")
    void deleteStudent(int id);

    @Select("SELECT * FROM Student")
    List<Student> getAllStudents();
}
