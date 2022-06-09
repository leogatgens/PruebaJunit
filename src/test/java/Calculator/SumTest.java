package Calculator;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumTest {

    @Test
    void should_ReturnZero_When_PassEmptyListOfNumbers(){
        //given

        List<Double> numbers=new ArrayList<Double>();

        double expected = 0;
        //when
        IOperation calculatorManager = new Sum();
        double actual = calculatorManager.DoOperation(numbers);
        //then
        assertEquals(expected,actual);
    }

    @Test
    void should_SumTwoDecimalNumbers_When_PassTwoNumbers(){
        //given
        double firstNumber = 9.8;
        double secondNumber = 10.2;
        List<Double> numbers=new ArrayList<Double>();
        numbers.add(firstNumber);
        numbers.add(secondNumber);
        double expected = 20;
        //when
        IOperation calculatorManager = new Sum();
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
        List<Double> numbers=new ArrayList<Double>();
        numbers.add(firstNumber);
        numbers.add(secondNumber);
        numbers.add(thirdNumber);

        double expected = 20;
        //when
        IOperation calculatorManager = new Sum();
        double actual = calculatorManager.DoOperation(numbers);
        //then
        assertEquals(expected,actual);
    }


    @Test
    void should_SumTenDecimalNumbers_When_PassTenNumbers(){
        //given
        Double array[] = { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0};
        List<Double> numbers= Arrays.asList(array);


        double expected = 36;
        //when
        IOperation calculatorManager = new Sum();
        double actual = calculatorManager.DoOperation(numbers);
        //then
        assertEquals(expected,actual);
    }


}
