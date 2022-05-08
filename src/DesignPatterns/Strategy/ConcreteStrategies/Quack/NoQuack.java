package DesignPatterns.Strategy.ConcreteStrategies.Quack;

import DesignPatterns.Strategy.AbstractStrategies.IQuackBehaviour;

public class NoQuack implements IQuackBehaviour {
    @Override
    public void quack() {
        System.out.println("No quack");
    }
}
