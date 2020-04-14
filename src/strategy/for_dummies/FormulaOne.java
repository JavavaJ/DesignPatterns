package strategy.for_dummies;

public class FormulaOne extends Vehicle {

    public FormulaOne() {
        setGoAlgorithm(new Driving());
    }
}
