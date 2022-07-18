import CalculatorStrategy.Context;
import CalculatorStrategy.Multiplication;
import CalculatorStrategy.Subtract;
import CalculatorStrategy.Sum;
import StatePattern.Party;
import StatePattern.Silent;
import StatePattern.StateContext;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args){
        runStrategyExample();
        runStatePatternExample();
    }

    private static void runStrategyExample() {
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

        context.setStrategy(new Sum());
        System.out.println(context.executeStrategy(numbers));

        context.setStrategy(new Multiplication());
        System.out.println(context.executeStrategy(numbers));
    }

    private static void runStatePatternExample(){
        var actualState = "";

        StateContext stateContext = new StateContext();
        stateContext.alert();
        stateContext.changeTheme();
        actualState = stateContext.getState();
        System.out.println(actualState);

        //Modo silent
        stateContext.setState(new Silent());
        stateContext.alert();
        stateContext.changeTheme();
        actualState = stateContext.getState();
        System.out.println(actualState);

        //Modo party
        stateContext.setState(new Party());
        stateContext.alert();
        stateContext.changeTheme();
        actualState = stateContext.getState();
        System.out.println(actualState);
    }
}
