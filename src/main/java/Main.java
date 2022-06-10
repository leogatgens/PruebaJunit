import Calculator.Context;
import Calculator.Multiplication;
import Calculator.Subtract;
import Calculator.Sum;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args){
        String action = "subtraction";


        Context context = new Context();
        if (action.equals("addition")) {
            context.setStrategy(new Sum());
        }
        if (action.equals("subtraction")) {
            context.setStrategy(new Subtract());
        }
        if (action.equals("multiplication")) {
            context.setStrategy(new Multiplication());
        }
        Double[] array = { 100.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 10.0};
        List<Double> numbers= Arrays.asList(array);
       double result = context.executeStrategy(numbers);
        System.out.println(result);
    }
}
