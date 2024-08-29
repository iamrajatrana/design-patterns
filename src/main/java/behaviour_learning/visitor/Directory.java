package behaviour_learning.visitor;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemElement{

    public Directory(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    String name;

    private List<FileSystemElement> elements;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<FileSystemElement> getElements() {
        return elements;
    }

    public void addElement(FileSystemElement element) {
        this.elements.add(element);
    }

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
    }
}
