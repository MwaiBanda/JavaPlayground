package DesignPatterns.Strategy.ConcreteStrategies.Fly;

import DesignPatterns.Strategy.AbstractStrategies.IFlyBehaviour;

public class SimpleFlying implements IFlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Simple Flying");
    }
}
