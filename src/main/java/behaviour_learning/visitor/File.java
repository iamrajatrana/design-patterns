package behaviour_learning.visitor;

public class File implements FileSystemElement{


    String name;
    int sizeInBytes;

    public File(String name, int sizeInBytes) {
        this.name = name;
        this.sizeInBytes = sizeInBytes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSizeInBytes() {
        return sizeInBytes;
    }

    public void setSizeInBytes(int sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
    }

    @Override
    public void accept(FileSystemVisitor visitor) {
        visitor.visit(this);
    }
}
