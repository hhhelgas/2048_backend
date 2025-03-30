package world.app.core.repository;

import org.springframework.stereotype.Repository;
import world.app.core.model.User;

import java.util.*;

@Repository
public class ScoreRepository {

    private TreeMap<Integer, List<User>> scoreToUsers = new TreeMap<>(Collections.reverseOrder());

    public void addNewScore(Integer score, User user) {
        scoreToUsers.computeIfAbsent(score, k -> new ArrayList<>()).add(user);
    }

    public List<String> getScores() {
        List<String> scoresList = new ArrayList<>();
        for (Map.Entry<Integer, List<User>> entry : scoreToUsers.entrySet()) {
            for (User user : entry.getValue()) {
                scoresList.add(user.name() + " - " + entry.getKey());
            }
        }
        return scoresList;
    }
}
