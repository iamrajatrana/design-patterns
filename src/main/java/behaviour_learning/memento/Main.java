package behaviour_learning.memento;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.setContent("Version 1");

        History history = new History();
        history.push(editor.createState());

        editor.setContent("Version 2");
        history.push(editor.createState());

        editor.setContent("Version 3");

        editor.restoreState(history.pop());
        System.out.println(editor.getContent());

        editor.restoreState(history.pop());
        System.out.println(editor.getContent());

    }
}
