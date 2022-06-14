package CalculatorStrategie;

import java.util.List;

public class Multiplication implements IStrategyOperation {


    @Override
    public double DoOperation(List<Double> numbers) {
        return  numbers.stream().reduce(1.0, (accumulator, item) -> {
            System.out.println("accumulator " + accumulator);
            System.out.println("item "  + item);
            return accumulator * item;
        } );
    }
}
