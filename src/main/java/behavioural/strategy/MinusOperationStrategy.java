package behavioural.strategy;

public class MinusOperationStrategy extends AbstractOperationStrategy{

    public MinusOperationStrategy(int a, int b) {
        super(a, b);
    }

    @Override
    public void compute() {
        System.out.println(getA() - getB());
    }
}
