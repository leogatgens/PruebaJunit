package Calculator;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivisionTest {

    @Test
    void should_DivideTwoDecimalNumbers_When_PassTwoNumbers(){
        //given
        double firstNumber = 6;
        double secondNumber = 2;
        List<Double> numbers= new ArrayList<>();
        numbers.add(firstNumber);
        numbers.add(secondNumber);
        double expected = 3;
        //when
        IOperation calculatorManager = new Division();
        double actual = calculatorManager.DoOperation(numbers);
        //then
        assertEquals(expected,actual);
    }
}
