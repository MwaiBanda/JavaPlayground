package DesignPatterns.Strategy.ConcreteStrategies.Quack;

import DesignPatterns.Strategy.AbstractStrategies.IQuackBehaviour;

public class SimpleQuack implements IQuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Simple quack");
    }
}
