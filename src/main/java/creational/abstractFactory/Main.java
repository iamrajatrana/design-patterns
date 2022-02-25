package creational.abstractFactory;


import creational.abstractFactory.animal.IAnimal;
import creational.abstractFactory.shape.IShape;

public class Main {
    public static void main(String[] args) {
        AbstractFactory animalFactory = FactoryProvider.getFactory("Animal");
        AbstractFactory shapeFactory = FactoryProvider.getFactory("Shape");

        IAnimal dog = (IAnimal) animalFactory.create("DOG").get();
        dog.makeSound();

        IShape circle = (IShape) shapeFactory.create("CIRCLE").get();
        circle.getShape();
    }
}
