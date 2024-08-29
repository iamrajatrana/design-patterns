package behaviour_learning.visitor;


//The Visitor Design Pattern is a behavioral pattern that allows you to add further operations to objects without having to modify them. It's useful when you have a structure of objects (like an object tree or a collection) and you want to perform various operations on these objects that are unrelated to the class of these objects.
//
//        The pattern involves two main parts:
//
//        Visitor Interface: Defines the operations that can be performed. Each operation is typically represented by a method.
//        Concrete Visitor: Implements the visitor interface and provides concrete implementations of the operations.
//        Element Interface: Defines an accept method that accepts a visitor object.
//        Concrete Element: Implements the element interface and provides the implementation of the accept method.

public class Main {
    public static void main(String[] args) {
        FileSystemElement file1 = new File("file1.txt", 100);
        FileSystemElement file2 = new File("file2.txt", 200);
        FileSystemElement file3 = new File("file3.txt", 300);
        FileSystemElement file4 = new File("file4.txt", 500);

        Directory dir1 = new Directory("dir1");
        dir1.addElement(file1);
        dir1.addElement(file2);

        Directory dir2 = new Directory("dir2");
        dir2.addElement(file3);
        dir2.addElement(dir1);
        dir2.addElement(file4);

        SizeCalculatorVisitor visitor = new SizeCalculatorVisitor();
        dir2.accept(visitor);

        System.out.println("Total size of files: " + visitor.getTotalSize());

        PrinterVisitor printerVisitor = new PrinterVisitor();
        dir2.accept(printerVisitor);

    }
}
