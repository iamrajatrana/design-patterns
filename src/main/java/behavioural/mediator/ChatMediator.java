package behavioural.mediator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ChatMediator implements IChatMediator{

    List<User> users = new ArrayList<>();

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(User from, String message) {
        users.stream().filter(user -> user != from).forEach(user -> user.recieve(message));
    }
}
