package CalculatorStrategie;

import java.util.List;

public class Division  implements IStrategyOperation {
    @Override
    public double DoOperation(List<Double> numbers) {
        return  numbers.stream().skip(1).reduce(numbers.get(0), (accumulator, item) -> {
            System.out.println("accumulator " + accumulator);
            System.out.println("item "  + item);
            return accumulator / item;
        } );
    }
}
