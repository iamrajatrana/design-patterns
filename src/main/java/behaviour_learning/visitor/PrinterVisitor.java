package behaviour_learning.visitor;

public class PrinterVisitor implements FileSystemVisitor {

    private int indentLevel = 0;

    private String getIndent() {
        return " ".repeat(indentLevel * 4);  // 4 spaces per indent level
    }

    @Override
    public void visit(File file) {
        System.out.println(getIndent() + "File: " + file.getName());
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(getIndent() + "Directory: " + directory.getName());
        indentLevel++;

        for (FileSystemElement element : directory.getElements()) {
            element.accept(this);
        }

        indentLevel--;
    }
}
