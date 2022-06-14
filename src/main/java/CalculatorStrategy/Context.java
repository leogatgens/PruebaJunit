package CalculatorStrategy;

import java.util.List;

public class Context {

    private IStrategyOperation strategy;

    public void setStrategy(IStrategyOperation strategy) {
        this.strategy = strategy;
    }

    public double executeStrategy(List<Double> numbers){
       return strategy.DoOperation( numbers);
    }
}
