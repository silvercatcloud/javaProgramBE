-- 创建数据库
create database student_manager;

-- 使用数据库
use student_manager;
CREATE TABLE Student (
                         id INT PRIMARY KEY,
                         name VARCHAR(50),
                         gender VARCHAR(10),
                         age INT,
                         major VARCHAR(50)
);

CREATE TABLE Score (
                       courseId INT,
                       courseName VARCHAR(50),
                       score DOUBLE,
                       studentId INT,
                       PRIMARY KEY (courseId, studentId),
                       FOREIGN KEY (studentId) REFERENCES Student(id)
);