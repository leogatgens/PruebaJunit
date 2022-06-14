package CalculatorStrategy;

import java.util.List;

public class Subtract implements IStrategyOperation {
    @Override
    public double DoOperation(List<Double> numbers) {
        return DoSubtractRefactored(numbers);

    }

    private double DoSubtractRefactored(List<Double> numbers) {
        if (numbers.size() == 0) {
            throw new ArrayIndexOutOfBoundsException("La lista de numeros no contiene elementos");
        }
        return  numbers.stream().skip(1).reduce(numbers.get(0), (accumulator, item) -> {
            System.out.println("accumulator " + accumulator);
            System.out.println("item "  + item);
            return accumulator - item;
        } );
//        double total = numbers.get(0);
//        for (int i = 1; i < numbers.size()  ; i++) {
//            total = total - numbers.get(i);
//        }
//        return total;
    }


}
