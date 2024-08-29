package behaviour_learning.memento;

public class Editor {
    private String content;
    private EditorState editorState;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public EditorState createState() {
        return new EditorState(content);
    }

    public void restoreState(EditorState state) {
        this.content = state.getContent();
    }

}
