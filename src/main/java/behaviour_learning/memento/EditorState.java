package behaviour_learning.memento;

public class EditorState {

    String content;

    public EditorState(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
