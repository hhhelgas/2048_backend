package world.app.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import world.app.core.model.User;
import world.app.core.repository.ScoreRepository;

import java.util.List;

@Service
public class ScoreService {

    @Autowired
    private ScoreRepository scoreRepository;

    public void addNewScore(Integer score, User user) {
        scoreRepository.addNewScore(score, user);
    }

    public List<String> getScores() {
        return scoreRepository.getScores();
    }
}
