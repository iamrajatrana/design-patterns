package creational.factoryMethod;

public class Dog implements IAnimal{

    @Override
    public void makeSound() {
        System.out.println("WOOF WOOF..!!!");
    }

    @Override
    public void walk() {
        System.out.println("i am walking");
    }
}
