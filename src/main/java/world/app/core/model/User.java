package world.app.core.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public record User(int id, String name, String surname, int score) {
    @JsonCreator
    public User(@JsonProperty("id") int id, @JsonProperty("name") String name, @JsonProperty("surname") String surname, @JsonProperty("score") int score) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.score = score;
    }
}