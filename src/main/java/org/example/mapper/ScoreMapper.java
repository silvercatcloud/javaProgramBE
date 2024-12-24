package org.example.mapper;

import org.apache.ibatis.annotations.*;
import org.example.pojo.Score;

import java.util.List;

@Mapper
public interface ScoreMapper {
    @Insert("INSERT INTO Score(courseId, courseName, score, studentId) VALUES(#{courseId}, #{courseName}, #{score}, #{studentId})")
    void addScore(Score score);

    @Update("UPDATE Score SET score=#{score}, courseName=#{courseName} WHERE courseId=#{courseId} AND studentId=#{studentId}")
    void updateScore(Score score);

    @Select("SELECT * FROM Score WHERE studentId = #{studentId}")
    List<Score> getScoresByStudentId(int studentId);

    @Delete("DELETE FROM Score WHERE studentId = #{studentId}")
    void deleteScoresByStudentId(int studentId);
    /**
     * 查询学生的总分
     * @param studentId 学生ID
     * @return 总分
     */
    @Select("SELECT SUM(score) FROM Score WHERE studentId = #{studentId}")
    Double getTotalScoreByStudentId(int studentId);

    /**
     * 查询学生的平均分
     * @param studentId 学生ID
     * @return 平均分
     */
    @Select("SELECT ROUND(AVG(score), 2) FROM Score WHERE studentId = #{studentId}")
    Double getAverageScoreByStudentId(int studentId);
}
