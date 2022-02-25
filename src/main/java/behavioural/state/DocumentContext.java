package behavioural.state;

public class DocumentContext {

    private String documentId;
    private State state;

    public DocumentContext(String documentId) {
        this.documentId = documentId;
        this.state = Draft.getInstance();
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public void setCurrentState(State state) {
        this.state = state;
    }

    public void update() {
        state.nextState(this);
    }
}
