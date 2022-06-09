package Calculator;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubtractTest {


    @Test
    void should_SubtractTwoDecimalNumbers_When_PassTwoNumbers() {
        //given
        double firstNumber = 9.8;
        double secondNumber = 10.8;
        List<Double> numbers = new ArrayList<Double>();
        numbers.add(firstNumber);
        numbers.add(secondNumber);
        double expected = -1;
        //when
        IOperation calculatorManager = new Subtract();
        double actual = calculatorManager.DoOperation(numbers);
        //then
        assertEquals(expected, actual);
    }
}
