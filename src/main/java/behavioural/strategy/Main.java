package behavioural.strategy;

public class Main {

    public static void main(String[] args) {

        CalculatorContext context = new CalculatorContext(new PlusOperationStrategy(5,4));
        context.compute();

        context = new CalculatorContext(new MinusOperationStrategy(5,4));
        context.compute();
    }
}
