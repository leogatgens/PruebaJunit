package Calculator;

import java.util.List;

class  Sum implements IOperation {


//    private double doSum(List<Double> numbers) {
//        double sumResult = 0;
//        double elementsCounter = numbers.stream().count();
//        if(elementsCounter > 3) {
//         return numbers.stream().collect(summingDouble(f -> f));
//        }
//        if( elementsCounter == 3) {
//            sumResult = numbers.get(0) + numbers.get(1) + numbers.get(2);
//        } else{
//            sumResult = numbers.get(0) + numbers.get(1);
//        }
//        return sumResult;
//    }
    private double doSumRefactored(List<Double> numbers) {
            //return numbers.stream().collect(summingDouble(f -> f));
        return numbers.stream().mapToDouble(Double::doubleValue).sum();
    }

    @Override
    public double DoOperation(List<Double> numbers) {
       return doSumRefactored(numbers);
    }
}
