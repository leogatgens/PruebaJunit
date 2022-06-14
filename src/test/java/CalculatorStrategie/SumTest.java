package CalculatorStrategie;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumTest {
    private IStrategyOperation calculatorManager;
    @BeforeEach
    void setup(){
        calculatorManager = new Sum();
    }
    @Test
    void should_ReturnZero_When_PassEmptyListOfNumbers(){
        //given

        List<Double> numbers= new ArrayList<>();

        double expected = 0;
        //when

        double actual = calculatorManager.DoOperation(numbers);
        //then
        assertEquals(expected,actual);
    }

    @Test
    void should_SumTwoDecimalNumbers_When_PassTwoNumbers(){
        //given
        double firstNumber = 9.8;
        double secondNumber = 10.2;
        List<Double> numbers= new ArrayList<>();
        numbers.add(firstNumber);
        numbers.add(secondNumber);
        double expected = 20;
        //when

        double actual = calculatorManager.DoOperation(numbers);
        //then
        assertEquals(expected,actual);
    }

    @Test
    void should_SumThreeDecimalNumbers_When_PassThreeNumbers(){
        //given
        double firstNumber = 5;
        double secondNumber = 7.5;
        double thirdNumber = 7.5;
        List<Double> numbers= new ArrayList<>();
        numbers.add(firstNumber);
        numbers.add(secondNumber);
        numbers.add(thirdNumber);

        double expected = 20;
        //when

        double actual = calculatorManager.DoOperation(numbers);
        //then
        assertEquals(expected,actual);
    }


    @Test
    void should_SumTenDecimalNumbers_When_PassTenNumbers(){
        //given
        Double[] array = { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0};
        List<Double> numbers= Arrays.asList(array);


        double expected = 36;
        //when
        IStrategyOperation calculatorManager = new Sum();
        double actual = calculatorManager.DoOperation(numbers);
        //then
        assertEquals(expected,actual);
    }


}
