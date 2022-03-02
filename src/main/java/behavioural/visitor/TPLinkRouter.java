package behavioural.visitor;

public class TPLinkRouter implements IRouter {
    @Override
    public void send(char[] data) {

    }

    @Override
    public void receive(char[] data) {

    }

    public void accept(IRouterVisitor visitor) {
        visitor.visit(this);
    }
}
