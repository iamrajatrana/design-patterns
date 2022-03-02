package behavioural.visitor;

public interface IRouter {
    public void send(char[] data);
    public void receive(char[] data);
}
