package creational.abstractFactory.shape;

import creational.abstractFactory.AbstractFactory;
import creational.abstractFactory.shape.Circle;
import creational.abstractFactory.shape.IShape;
import creational.abstractFactory.shape.Rectangle;

import java.util.Optional;

public class ShapeFactory implements AbstractFactory<IShape> {
    public Optional<IShape> create(String type) {
        if ("CIRCLE".equals(type))
            return Optional.of(new Circle());
        else if ("RECTANGLE".equals(type))
            return Optional.of(new Rectangle());
        return Optional.empty();
    }
}
