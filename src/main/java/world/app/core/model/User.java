package world.app.core.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public record User(int id, String name, String surname, int score) {
    @Override
    public int id() {
        return id;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public String surname() {
        return surname;
    }

    @Override
    public int score() {
        return score;
    }

    @JsonCreator
    public User(@JsonProperty("id") int id, @JsonProperty("name") String name, @JsonProperty("surname") String surname, @JsonProperty("score") int score) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.score = score;
    }
}