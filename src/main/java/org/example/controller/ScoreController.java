package org.example.controller;

import org.example.pojo.Score;
import org.example.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/scores")
public class ScoreController {

    @Autowired
    private ScoreService scoreService;

    /**
     * 添加学生成绩
     * @param score 成绩对象
     */
    @PostMapping
    public void addScore(@RequestBody Score score) {
        scoreService.addScore(score);
    }

    /**
     * 修改学生成绩
     * @param score 成绩对象
     */
    @PutMapping
    public void updateScore(@RequestBody Score score) {
        scoreService.updateScore(score);
    }

    /**
     * 根据学生ID查询成绩
     * @param studentId 学生ID
     * @return 成绩列表
     */
    @GetMapping("/{studentId}")
    public List<Score> getScoresByStudentId(@PathVariable int studentId) {
        return scoreService.getScoresByStudentId(studentId);
    }

    /**
     * 删除某个学生的所有成绩
     * @param studentId 学生ID
     */
    @DeleteMapping("/{studentId}")
    public void deleteScoresByStudentId(@PathVariable int studentId) {
        scoreService.deleteScoresByStudentId(studentId);
    }
}
