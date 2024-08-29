package behaviour_learning.visitor;

public interface FileSystemElement {
    public void accept(FileSystemVisitor visitor);
}
