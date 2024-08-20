package creational.prototype;

public class Main {
    public static void main(String[] args) {
        // Creating original objects
        Circle originalCircle = new Circle(10, "Red");
        Rectangle originalRectangle = new Rectangle(20, 30, "Blue");

        // Cloning objects
        Circle clonedCircle = (Circle) originalCircle.clone();
        Rectangle clonedRectangle = (Rectangle) originalRectangle.clone();

        // Displaying original and cloned objects
        System.out.println("Original Circle: " + originalCircle);
        System.out.println("Cloned Circle: " + clonedCircle);
        System.out.println("Original Rectangle: " + originalRectangle);
        System.out.println("Cloned Rectangle: " + clonedRectangle);
    }
}

