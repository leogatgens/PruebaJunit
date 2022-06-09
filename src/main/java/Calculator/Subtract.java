package Calculator;

import java.util.List;

public class Subtract implements  IOperation {
    @Override
    public double DoOperation(List<Double> numbers) {
        return DoSubtract(numbers);

    }

    private double DoSubtract(List<Double> numbers) {

        if((long) numbers.size() <= 2 ){
           return numbers.get(0) - numbers.get(1);
        }else{
            return numbers.get(0) - numbers.get(1) - numbers.get(2);
        }


    }
}
