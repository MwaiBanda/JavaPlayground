package DesignPatterns.Strategy.ConcreteStrategies.Fly;

import DesignPatterns.Strategy.AbstractStrategies.IFlyBehaviour;

public class NoFlying implements IFlyBehaviour {
    @Override
    public void fly() {
        System.out.println("No Flying");
    }
}
