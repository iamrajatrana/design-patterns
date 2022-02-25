package behavioural.state;

public class Moderation implements State{
    private static Moderation instance = new Moderation();

    private Moderation() {}

    public static Moderation getInstance() {
        return instance;
    }

    @Override
    public void nextState(DocumentContext ctx) {
        System.out.println("Document {} is in Moderation State " + ctx.getDocumentId());
        ctx.setCurrentState(Published.getInstance());
    }
}
