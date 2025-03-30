package world.app.core.repository;

import org.springframework.stereotype.Repository;
import world.app.core.model.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class UserRepository {
    private List<User> users = new ArrayList<>();
    private int idCounter = 0;

    public List<User> getAllUsers() {
        return Collections.unmodifiableList(users);
    }

    public User create(User user) {
        User newUser = new User(getNextID(), user.name(), user.surname(), user.score());
        users.add(newUser);
        return newUser;
    }

    private int getNextID(){
        return ++idCounter;
    }
}
