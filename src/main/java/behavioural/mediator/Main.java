package behavioural.mediator;

public class Main {
    public static void main(String[] args) {
        IChatMediator mediator = new ChatMediator();
        User user1 = new ChatUser(mediator, "Pankaj");
        User user2 = new ChatUser(mediator, "Lisa");
        User user3 = new ChatUser(mediator, "Saurabh");
        User user4 = new ChatUser(mediator, "David");
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("Hi All");


    }
}
