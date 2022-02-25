package creational.abstractFactory.animal;

public class Duck implements IAnimal {

    @Override
    public void makeSound() {
        System.out.println("Quack Quack..!!!");
    }

    @Override
    public void walk() {
        System.out.println("i am walking");
    }
}


