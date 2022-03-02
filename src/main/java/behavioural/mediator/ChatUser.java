package behavioural.mediator;

public class ChatUser extends User {

    public ChatUser(IChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void send(String message) {
        System.out.println(this.name+": Sending Message="+message);
        this.mediator.sendMessage(this, message);
    }

    @Override
    public void recieve(String message) {
        System.out.println(this.name+": Received Message:"+message);    }
}
