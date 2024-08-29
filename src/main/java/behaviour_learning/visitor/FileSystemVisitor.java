package behaviour_learning.visitor;

public interface FileSystemVisitor {
    public void visit(File file);
    public void visit(Directory directory);
}
