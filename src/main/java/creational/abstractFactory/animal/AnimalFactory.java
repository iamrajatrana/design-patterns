package creational.abstractFactory.animal;

import creational.abstractFactory.AbstractFactory;
import creational.abstractFactory.animal.Dog;
import creational.abstractFactory.animal.Duck;
import creational.abstractFactory.animal.IAnimal;

import java.util.Optional;

public class AnimalFactory implements AbstractFactory<IAnimal> {

    @Override
    public Optional<IAnimal> create(String type) {
        if ("DOG".equals(type))
            return Optional.of(new Dog());
        else if ("DUCK".equals(type))
            return Optional.of(new Duck());
        return Optional.empty();
    }
}
