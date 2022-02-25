package behavioural.state;

import java.util.HashMap;

public class Draft implements State{

    private static Draft instance = new Draft();

    private Draft() {}

    public static Draft getInstance() {
        return instance;
    }

    @Override
    public void nextState(DocumentContext ctx) {
        System.out.println("Document {} is in Draft State " + ctx.getDocumentId());
        ctx.setCurrentState(Moderation.getInstance());
    }
}
