package org.example.service;

import org.example.mapper.ScoreMapper;
import org.example.pojo.Score;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoreService {
    @Autowired
    private ScoreMapper scoreMapper;

    public void addScore(Score score) {
        scoreMapper.addScore(score);
    }

    public void updateScore(Score score) {
        scoreMapper.updateScore(score);
    }

    public List<Score> getScoresByStudentId(int studentId) {
        return scoreMapper.getScoresByStudentId(studentId);
    }

    public void deleteScoresByStudentId(int studentId) {
        scoreMapper.deleteScoresByStudentId(studentId);
    }
}
