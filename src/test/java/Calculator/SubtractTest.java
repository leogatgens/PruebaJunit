package Calculator;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubtractTest {


    @Test
    void should_SubtractTwoDecimalNumbers_When_PassTwoNumbers() {
        //given
        double firstNumber = 9.8;
        double secondNumber = 10.8;
        List<Double> numbers = new ArrayList<>();
        numbers.add(firstNumber);
        numbers.add(secondNumber);
        double expected = -1;
        //when
        IOperation calculatorManager = new Subtract();
        double actual = calculatorManager.DoOperation(numbers);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void should_SubtractThreeDecimalNumbers_When_PassThreeNumbers() {
        //given
        double firstNumber = 20.0;
        double secondNumber = 10.0;
        double thirdNumber = 5.0;

        List<Double> numbers = new ArrayList<>();
        numbers.add(firstNumber);
        numbers.add(secondNumber);
        numbers.add(thirdNumber);
        double expected = 5;
        //when
        IOperation calculatorManager = new Subtract();
        double actual = calculatorManager.DoOperation(numbers);
        //then
        assertEquals(expected, actual);
    }

    @Test
    void should_SubtractTenDecimalNumbers_When_PassTenNumbers() {
        //given
        Double[] array = { 100.0, 5.0, 5.0, 5.0, 5.0, 5.0, 5.0, 10.0};
        List<Double> numbers= Arrays.asList(array);


        double expected = 60;
        //when
        IOperation calculatorManager = new Subtract();
        double actual = calculatorManager.DoOperation(numbers);
        //then
        assertEquals(expected, actual);
    }

}
