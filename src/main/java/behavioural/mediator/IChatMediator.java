package behavioural.mediator;

public interface IChatMediator {
    void addUser(User user);

    public void sendMessage(User from, String message);
}
