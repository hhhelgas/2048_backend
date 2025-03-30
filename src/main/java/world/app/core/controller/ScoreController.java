package world.app.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import world.app.core.model.User;
import world.app.core.service.ScoreService;

import java.util.List;

@RestController
@RequestMapping("/score")
@CrossOrigin(origins = "http://127.0.0.1:5500") // Разрешаем запросы от клиента
public class ScoreController {

    @Autowired
    private ScoreService scoreService;

    @PostMapping("/addNewScore")
    public void addNewScore(@RequestParam Integer score, @RequestBody User user) {
        scoreService.addNewScore(score, user);
    }

    @GetMapping("/getscores")
    public List<String> getScores() {
        return scoreService.getScores();
    }
}
