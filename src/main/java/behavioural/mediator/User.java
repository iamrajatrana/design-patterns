package behavioural.mediator;

public abstract class User {
    IChatMediator mediator;
    String name;

    public User(IChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void send(String message);

    public abstract void recieve(String message);

}
