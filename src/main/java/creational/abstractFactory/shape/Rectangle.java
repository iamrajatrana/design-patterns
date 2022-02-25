package creational.abstractFactory.shape;

import creational.abstractFactory.shape.IShape;

public class Rectangle implements IShape {
    @Override
    public void getShape() {
        System.out.println("Rectangle");
    }
}
