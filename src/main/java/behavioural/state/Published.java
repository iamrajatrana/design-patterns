package behavioural.state;

public class Published implements State{
    private static Published instance = new Published();

    private Published() {}

    public static Published getInstance() {
        return instance;
    }

    @Override
    public void nextState(DocumentContext ctx) {
        System.out.println("Document {} is in Published State " + ctx.getDocumentId());
    }
}

