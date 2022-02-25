package creational.abstractFactory;

import creational.abstractFactory.animal.AnimalFactory;
import creational.abstractFactory.shape.ShapeFactory;

public class FactoryProvider {
    public static AbstractFactory getFactory(String choice) {
        if ("Animal".equalsIgnoreCase(choice)) {
            return new AnimalFactory();
        } else if ("Shape".equalsIgnoreCase(choice)) {
            return new ShapeFactory();
        }
        return null;
    }
}
