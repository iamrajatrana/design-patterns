package creational.factoryMethod;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        Optional<IAnimal> dog = AnimalFactory.getAnimal("DOG");
        if (dog.isPresent()) {
            dog.get().makeSound();
            dog.get().walk();
        }

        Optional<IAnimal> duck = AnimalFactory.getAnimal("DUCK");
        if (duck.isPresent()) {
            duck.get().makeSound();
            duck.get().walk();
        }
    }
}
