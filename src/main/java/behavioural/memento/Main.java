package behavioural.memento;

public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor(new TextWindow());
        textEditor.write("The Memento Design Pattern\n");
        textEditor.write("How to implement it in Java?\n");
        textEditor.hitSave();
        textEditor.print();

        textEditor.write("Buy milk and eggs before coming home\n");
        textEditor.print();

        textEditor.hitUndo();
        textEditor.print();
    }
}
