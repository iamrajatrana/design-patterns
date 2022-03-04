package behavioural.memento;

public class TextWindow {

    StringBuilder text;

    public TextWindow() {
        this.text = new StringBuilder();
    }

    public StringBuilder getText() {
        return text;
    }

    public StringBuilder addText(String text) {
        return this.text.append(text);
    }

    public TextWindowState save() {
        return new TextWindowState(text.toString());
    }

    public void restore(TextWindowState state) {
        this.text = new StringBuilder(state.getText());
    }
}
