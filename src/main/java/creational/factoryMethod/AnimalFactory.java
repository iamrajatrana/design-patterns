package creational.factoryMethod;

import java.util.Optional;

public class AnimalFactory{

    public static Optional<IAnimal> getAnimal(String type) {
        if("DOG".equals(type))
            return Optional.of(new Dog());
        else if("DUCK".equals(type))
            return Optional.of(new Duck());
        return Optional.empty();
    }
}
