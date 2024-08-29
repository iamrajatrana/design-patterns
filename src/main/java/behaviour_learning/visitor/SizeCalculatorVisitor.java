package behaviour_learning.visitor;

public class SizeCalculatorVisitor implements FileSystemVisitor{

    int totalSize = 0;

    @Override
    public void visit(File file) {
        totalSize += file.getSizeInBytes();
    }

    @Override
    public void visit(Directory directory) {
        for (FileSystemElement e: directory.getElements()) {
            e.accept(this);
        }
    }

    public int getTotalSize() {
        return totalSize;
    }
}
